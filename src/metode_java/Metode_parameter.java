package metode_java;

public class Metode_parameter {
    

    /* 
     
        => informasi dapat di teruskan ke metode sabagai parameter , parameter bertindak sebagai variable di dalam methode
        => 




        => return value 
            => kata kunci void berati niali tidak memiliki nilai kembalian 
            => untuk membuat method dengan nilai kembalian kita bisa menggukan kata kunci 
                => int 
                => char
                => sebagai ganti void
                => dan menggunakan kata return di dalam methode 

    
     */


     // parameter 
     public static void nama_method(String fname){

        System.out.println("nama : " + fname);

     }

     public static int myMethodReturn(int x){
        return 5 + x;
     }


     public static int penjumlahan(int x, int y){
        return x + y;
     }



}
