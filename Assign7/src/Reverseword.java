public class Reverseword {
    public static void main(String[] args) {
        int j;
    String str="Java J2EE Reverse Me";
    String s[]=str.split("");
    String s1="";

    for (int i=0;i<=s.length-1;i++){
        s1=s[i];
        s1=s1+" ";
        for(j=s1.length()-1;j>=0;j--){
            System.out.println(s1.charAt(j));
        }
    }
    }
}
