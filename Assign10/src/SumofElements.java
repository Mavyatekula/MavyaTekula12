import java.util.concurrent.*;
public class SumofElements {
    private static int[] arr = new int[100];
    private static int num = 5;
    private static int SumSize;
    private static int TotalSum = 0;

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        ExecutorService executorService = Executors.newFixedThreadPool(num);

        Future<Integer>[] Sums = new Future[num];

        for (int i = 0; i < num; i++) {
            int startIndex = i * SumSize;
            int endIndex = startIndex + SumSize;

            if (i == num - 1) {
                endIndex = arr.length;
            }

            Sums[i] = executorService.submit(new ArraySumTask(startIndex, endIndex));
        }

        // Wait for all partial sums to be calculated and add them up
        for (int i = 0; i < num; i++) {
            try {
                TotalSum += Sums[i].get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Shutdown the executor
        executorService.shutdown();

        // Print the final sum
        System.out.println("The sum of the array elements is: " + TotalSum);
    }

    static class ArraySumTask implements Callable<Integer> {
        private int startIndex;
        private int endIndex;

        public ArraySumTask(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public Integer call() {
            int partialSum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                partialSum += arr[i];
            }
            return partialSum;
        }
    }
}
