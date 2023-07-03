public class Personage {
    static void printagewise(int age)

    {

        if (age > 13 && age < 19)
        {
            System.out.println("teen");
        } else if (age < 13)
        {
            System.out.println("kid");
        }
        else {
            System.out.println("adult");
        }
    }
    public static void main(String[] args){
        int ageofperson=12;
        printagewise(ageofperson);
    }
}
