public class Rotate {
    public static void main(String[] args) {
        int num[] = {3, 4, 5, 6, 7, 8};
        int position = 2;

        for (int i = 0; i < position; i++) {
            int id = num[0];
            for (int j = 0; j < num.length - 1; j++) {
                num[j] = num[j + 1];

            }
            num[num.length - 1] = id;
        }
        for(int i=0;i<num.length;i++) {
            System.out.print( num[i]+" ");
        }
    }
}

