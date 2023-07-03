class CustomException extends Exception{
    public CustomException(String msg){
    super(msg);
    }
}
public class Execeptionconvert {
public static void performDivision() throws CustomException{
    try{
        int result=10/0;
    }
    catch(RuntimeException r){
        throw new CustomException("Division by zero error");
    }

}
public static void main(String[] args){
    try{
        performDivision();
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}
}
