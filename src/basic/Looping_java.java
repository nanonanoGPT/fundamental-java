package basic;

public class Looping_java {



    /*
    
        macam macam looping dalam bahasa pemrogamana


        - while do loop

        - do while loop

        - for loop


     */

    public static void looping_java(){

        int i = 0;

        // while do
        // akan menjalankan perintah jika kondisi terpenuhi

        while (i < 5) {
            System.out.println(i);
            i++;
        }



        // do while 
        // akan selalu menjalankan perintah pertama

        do {
            System.out.println(i);
            i++;
        }
        while(i < 5);



        // for loop
        for (int j = 0; j<5; j++){
            System.out.println(j);
        }


        // looping bersarang

        for (int a = 0; a <= 10; a++ ){
            System.out.println("Outer : " + a);


            for (int b=0; b <= a; b++){
                System.out.println("inner : " + b);
            }
        }


        // for each loop
        // di gunakan untuk looping data array 

        String[] cars = {"Volvo", "bmw", "ford", "toyota"};
        for (String c : cars){
            System.out.println(c);
        }

        










    }
    
}
