public class fibanocciseries {
    static void printfiseries(int n){
        System.out.print("fibanocci for N series are: "+ n + "terms");
        for (int i=0;i<n;i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
    static int fibonacci(int n)
    {
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        int x=10;
        printfiseries(x);
    }
}
