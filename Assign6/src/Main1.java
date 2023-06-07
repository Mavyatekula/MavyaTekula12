public class Main1 {
    public static void main(String[] args) {

        int number[] = new int[]{10,4,15,20,5};
        int smaller = number[0];
        int larger = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i] < smaller) {
                smaller = number[i];
            } else if (number[i] > larger)
                larger = number[i];

        }
        System.out.println("smaller number is:" + smaller);
        System.out.println("Larger number is" + larger);
    }


}
