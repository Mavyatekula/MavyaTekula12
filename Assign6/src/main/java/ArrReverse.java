import java.util.Arrays;

public class ArrReverse {
    public static void main(String[] args) {
        int[] num = {3, 4, 5, 6, 7, 8};
        int i = 0;
        int j = num.length - 1;
        while (i < j) {
            int k = num[i];
            num[i] = num[j];
            num[j] = k;
            i++;
            j--;

    }
        System.out.println("smaller number is:" + Arrays.toString(num));

           }


}
