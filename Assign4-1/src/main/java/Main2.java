class Parentclass {
    protected int parentVariable;

    public Parentclass(int var1) {
        this.parentVariable = var1;
    }
}

class Childclass extends Parentclass {
    protected int childVariable;

    public Childclass(int var1, int var2) {
        super(var1);
        this.childVariable = var2;
    }

    public Childclass(int var2) {
        super(0); // Default value for parentVariable
        this.childVariable = var2;
    }
}
public class Main2 {
    public static void main(String[] args) {
        // Create instances of ParentClass and ChildClass
        Parentclass parent = new Parentclass(5);
        System.out.println("Parent Variable: " + parent.parentVariable);
        Childclass child1 = new Childclass(10, 20);
        System.out.println("Child1 Variables: " + child1.parentVariable + ", " + child1.childVariable);
        Childclass child2 = new Childclass(20);
        System.out.println("Child2 Variables: " + child2.parentVariable + ", " + child2.childVariable);


    }
}

