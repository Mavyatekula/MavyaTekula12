final class Main4 {
     private final int variable = 10;

    final void method1() {
        System.out.println("Final method");
    }
public static void main(String[] args){
    Main4 m=new Main4();
    m.method1();
    System.out.println("Variable final is :" +m.variable);
    }
}

