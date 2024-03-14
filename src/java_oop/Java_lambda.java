package java_oop;


interface StringFunction {
    String run(String str);
 }
 
public class Java_lambda {

    /*
     * => expresi lamda adalah blok kode pendek yg mengambil parameter dan
     * mengembalikan nilai
     * => expresi lambda mirip dengan metode namun tidak memerlukan nama dan di
     * implementasi langsung di badanmetode
     * => syntax
     * 
     * parameter => expressioon
     * 
     * 
     * 
     * 
     */


    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "|";
        StringFunction ask =  (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);

    }

    public static void printFormatted(String str, String format){
        String result = format.run(str);
        System.out.println(result);

    }

}
