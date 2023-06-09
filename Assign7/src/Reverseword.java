public class Reverseword {
    public static void main(String[] args) {
        String str = "Java J2EE Reverse Me";
        String[] letters = str.split(" ");

        for (int i = 0; i < letters.length; i++) {
            String reverseword = reverseword(letters[i]);
            System.out.print(reverseword + " ");
        }
    }

    public static String reverseword(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }
}
