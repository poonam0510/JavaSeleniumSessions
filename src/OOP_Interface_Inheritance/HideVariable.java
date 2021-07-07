package OOP_Interface_Inheritance;

public class HideVariable {

    private String message = "this is instance variable";

    HideVariable() {
        String message = "constructor local variable";
        System.out.println(message);
    }

    public void printLocalVariable() {
        String message = "method local variable";
        System.out.println(message);
    }

    public void printInstanceVariable() {
        String message = "method local variable";
        System.out.println(this.message);
    }
}