package basic;

public class Casting {


    /*
      type casting adalah saat anda meneteapkan nilai dari satu data primitif ke type lainya
      
     # ada 2 macam type casting
        => widening casting (otomatis) => mengubah type data dari ukuran kecil ke ukuran yg lebih besar 

        => narrowing casting (manual) => konversi  type data dari lebih besar ke yg lebih kecil 



     */


     public static void casting(){
            int myInt = 9;

            // widening casting
            double myDouble = myInt;

            // narrowing  casting 
            double myDouble1 = 5.3222d;
            int myInt1 = (int) myDouble1; 

            System.out.println(myInt);
            System.out.println(myDouble);
            

            System.out.println(myDouble1);
            System.out.println(myInt1);
    }
    
}
