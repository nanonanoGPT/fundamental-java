package java_oop;

import java.util.ArrayList;

public class ArrayList_java {


    /*
     `  => kelas ArrayList adalah Array yg dapat di rubah ukuranya , yg dapat di temukan di dalam 
            package java.util
        => 
     */
    

     public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();


        cars.add("Volvo");
        cars.add("BMW");
        cars.add("FORD");
        cars.add("mazda");


        // menampilkan semua data array
        System.out.println(cars);

        // akses element
        // System.out.println(cars.get(0));

        // ubah element
        // cars.set(0, "volvo edit");
        // System.out.println(cars.get(0));


        // hapus element 
        // cars.remove(0);
        // System.out.println(cars.get(0));


        // delete all data array 
        // cars.clear();
        // System.out.println(cars);
        // System.out.println(cars.size());


        // looping arrayd dengan for 
        System.out.println("looping data dengan for int");
        for(int i = 0; i<cars.size(); i++) {
            System.out.println(cars.get(i));
        }


        System.out.println("Looping data dengan foreach");
        // looping array dengan foreach
        for(String i: cars){
            System.out.println(i);
        }
     }
}
