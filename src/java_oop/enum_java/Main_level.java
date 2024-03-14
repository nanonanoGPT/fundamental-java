package java_oop.enum_java;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Main_level {

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        switch (myVar) {
            case LOW:
                System.out.println("low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("HIGH level");
                break;
        }
    }

}
