import java.util.Arrays;

public class averageofsqr {
    public static void main(String[] args){
        Integer[] values={5,3,2,1,6,7,8};

        double avg= Arrays.stream(values).filter(i->i%2 !=0)
                .mapToDouble(i->Math.pow(i,2))
                .average().orElse(0);
        System.out.println("Avg of squares of odd numbers are:" +avg);

    }
}
