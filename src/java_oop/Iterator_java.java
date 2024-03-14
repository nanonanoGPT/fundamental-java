package java_oop;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_java {

    /*
      => iterator java adalah object yg dapat di gunakan untuk mengulang koleksi , seperti arraylist
      => iterasi adalah istilah dari teknik untuk perulangan


      => GETTING ITTERATOR
      => 

     */
    

     public static void main(String[] args){
        
        // membuat collection
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("FORD");
        cars.add("MAZDA");


        // GETTING THE ITERATOR
        Iterator<String> it = cars.iterator();

        // System.out.println(it.next());


        // looping 
        while(it.hasNext()){
            System.out.println(it.next());
        }
     }
}
