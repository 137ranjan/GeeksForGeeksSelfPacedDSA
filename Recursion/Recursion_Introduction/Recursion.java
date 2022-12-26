package Recursion.Recursion_Introduction;

public class Recursion {
    public static void main(String[] args) {
        try {
            func1();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void func1() {
        System.out.println("GfG");
        func1();
    }
}
