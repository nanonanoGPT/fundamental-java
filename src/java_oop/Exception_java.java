package java_oop;

public class Exception_java {


    /*
      saat mengekseksui kode , kesalahan seringkali terjadi . kesalahan pengkodean yg di lakukan 
      oleh programer , kesalahan karena input yg salah, atau hal hal lain yg tidak terduga
      
      

      => java try and catch
      => di gunkan untuk mengalihkan erro menjadi informasi atau bisa di gunakan untuk mendbug
      => ada banyak kata kunci untuk try and catch kita pelajarin nanti saat kita butuh
      => 


     */


     public static void main(String[] args){



        try {
            int[] myNumber = {1,2,3};
            System.out.println(myNumber[10]);
        } catch (Exception e) {
            System.out.println("Something wnet wrong");
        }
     }
    
}
