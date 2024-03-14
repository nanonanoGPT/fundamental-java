package java_oop;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class User_input {

    /*
     * kelas scanner di gunaka untuk mendapatkan input pengguna, dan di temukan di
     * dalam java.util
     * package
     * 
     * => untuk menggunakan scanner kelas , buat object kelas dan gunakan salah satu
     * metode yg tersedia
     * yg di temukan dalam scanner dokumentsi kels
     * 
     * https://www.w3schools.com/java/java_user_input.asp
     * 
     * 
     */
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Masukan nama : ");

        // string input
        String name = myObj.nextLine();

        // numeric input
        int age = myObj.nextInt();

        double salary = myObj.nextDouble();

        System.out.println("nama : " + name);
        System.out.println("usia : "+ age);
        System.out.println("salary : " + salary);

    }

}
