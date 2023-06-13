public class Convertstring {
    public static int ConvertstringToInt(String input) throws NumberFormatException {

        return Integer.parseInt(input);
    }
    public static void main(String args[]) {

        String[] s = {"23", "45.67", "test", "123f"};
        for (int i = 0; i < s.length; i++) {
            try {
                int result = ConvertstringToInt(s[i]);
                System.out.println("Input is: " + s[i] + "Converted integer: " + result);
            }
            catch(NumberFormatException e){
                System.out.println("Input is: " +s[i]+ "Exception: " +e.getMessage());
            }
        }

    }
}



