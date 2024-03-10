package basic;

public class Array_java {

    /*
    
    
        => Array
        => loop trhrouhht  an array
        => multidimensi arrays


        array di gunakan untuk menyimpan beberapa nilai dalam 1 variable , alih alih mendeeklarasikan 
        variable terpisah untuk setiap nilai

        => deklarasi 
            String[] cars;

     */

    public static void array_java(){
        String[] cars = {"Volvo", "BMW", "FORD", "MAZDA"};
        int[] myNum = {1,2,3,4,5,6};


        // cara mengakses array 

        System.out.println(cars[0]);


        // ubah element array 
        cars[0] = "Opel";

        System.out.println(cars[0]);

        // cek panjang array atau banyak data 
        System.out.println(cars.length);
    }


    // looping data array 
    public static void array_loop(){
        String[] cars = {"Volvo", "BMW", "FORD", "MAZDA"};


        // for 
        for (int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
        }


        // foreach 
        for (String i : cars) {
            System.out.println(i);
        }
    }


    // array multi dimensi 
     
    /*
     array multi dimensi berguna untuk menyipan data dalam bentuk table seperti tabel dengan baris
     dan kolom 
     */

     public static void array_multi_dimensi(){
        int[][] myNumber = { {1,2,3,4}, {5,6,7} };


        // mengakses elemen array
        System.out.println(myNumber[1][2]);

        // merubah nilai array 
        myNumber[1][2] = 9;
        
     }


     public static void looping_array_multidimensi(){
        int[][] myNumber = { {1,2,3,4}, {5,6,7} };

        for (int i = 0; i< myNumber.length; ++i){
            for(int j = 0; j < myNumber[i].length; ++j){
                System.out.println(myNumber[i][j]);
            }
        }
     }




}
