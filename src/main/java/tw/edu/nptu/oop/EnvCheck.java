package tw.edu.nptu.oop;

public class EnvCheck {
    public static String message(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, Java OOP!";
        }
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        String name = args.length > 0 ? args[0] : "Java OOP";
        System.out.println(message(name));
    }
}