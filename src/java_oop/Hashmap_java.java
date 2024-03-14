package java_oop;

import java.util.HashMap;

public class Hashmap_java {
    

    /*
      hash map mirin dengan object di java ata json
     */

    public static void main(String[] args){

         HashMap<String, String> capitalCities = new HashMap<String, String>();


         // add keys dan values (coiuntry city);
         capitalCities.put("england", "london");
         capitalCities.put("Germany", "Berlin");
         capitalCities.put("Norway", "Oslo");
         capitalCities.put("USA", "Washington");

        // menampilkan semua data
         System.out.println(capitalCities);


         // menampilkan data berdasarkan get key 
         System.out.println(capitalCities.get("england"));


         // menghapus element
        //  capitalCities.remove("england");

         // menghapus semua data 
        //  capitalCities.clear();


         // menampilkan banyak data 
        //  capitalCities.size();


        //  looping hashmap dengan foreaach key dan value
        for(String i : capitalCities.keySet()){
            System.out.println(i + "value : " + capitalCities.get(i));
        }

        // cara kedua valuesnya aja 
        for(String i : capitalCities.values()){
            System.out.println(i);
        }

        


    }
}
