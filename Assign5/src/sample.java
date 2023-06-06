public class sample {
    static int reverse(int n) {
        int rev=0;
        int num;
        while (n > 0)
        {
            num = n % 10;
            rev = (rev * 10) + num;
            n = n / 10;
        }
        return rev;
    }
    public static void main(String args[]) {
        int n=123456;
        System.out.println("reverse of a number is:" +reverse(n));
    }

}

