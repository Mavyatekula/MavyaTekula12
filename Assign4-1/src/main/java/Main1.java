interface I1{
        void method1();
}
interface I2{
        void method2();
}
class Self implements I1,I2 {
        public void method1() {
                System.out.println("interface abstarct method 1");
        }

        public void method2() {
                System.out.println("interface abstract method 2");
        }
}
public class Main1  {
        public static void main(String[] args){
                Self s=new Self();
                s.method1();
                s.method2();


        }
}