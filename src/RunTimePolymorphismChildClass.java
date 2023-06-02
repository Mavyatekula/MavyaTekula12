public class RunTimePolymorphismChildClass extends RunTimePolymorphismParentClass{
    public int addition (int x,int y) {
        return super.addition(x, y);
    }
    public static void main(String[] args){
        RunTimePolymorphismParentClass rtmp=new RunTimePolymorphismParentClass();
        int a=rtmp.addition(8,9);
        RunTimePolymorphismChildClass rtmc=new RunTimePolymorphismChildClass();
        int b=rtmc.addition(12,23);
        System.out.println(a+" "+b);
    }
}
