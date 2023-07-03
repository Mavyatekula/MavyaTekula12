public class Main3 {
    public static void main(String[] args) {
        int number = Self1.getvariable();
        System.out.println("Variable return value" + number);
    }
}

    class Self1 {
        static int variable;
        static{
            variable=initializevariable();
        }
        public static int initializevariable(){
            return 12;
        }
        public static int getvariable() {
            return variable;
        }
    }




