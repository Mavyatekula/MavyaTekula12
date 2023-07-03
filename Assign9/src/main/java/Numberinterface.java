public class Numberinterface implements Runnable{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
        public static void main(String[] args){
            Numberinterface num = new Numberinterface();
            Thread t=new Thread(num);
            t.start();
        }
}
