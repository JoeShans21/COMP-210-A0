package a0;

public class Main {
    public static void main(String[] args) {
        // Prints out your Java version
        // Make sure it is 10.0 or higher
        System.out.println("Your Java version: " + System.getProperty(("java.version")));

        System.out.println(sayHello());

    }

    public static String sayHello() {
        return "Hello World";
    }



}
