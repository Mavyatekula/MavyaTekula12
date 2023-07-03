public class Vowel {
    public static void main(String[] args) {
        int value = 0;
        String str = "MavyaReddy";


        for(int i = 0; i<str.length();i++)
    {
        if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
            value++;
        }
    }
        System.out.println("total no of vowels are" +value);
    }
}

