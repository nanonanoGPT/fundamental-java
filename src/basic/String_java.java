package basic;

public class String_java {

    /*
        string di gunakan untuk menyimpan text
        variable string berisi kumpulan karakter yg dia apit kutip ganda 

     */

    public static void string_java(){

        String txt = "nama saya siapa sih?";
        
        // fungsi lenght
        System.out.println("panjang karakter string adalah : " + txt.length());


        // meerubah mejadi huruf besar semua
        System.out.println(txt.toUpperCase());


        // merubah menjadi huruf kecl semua
        System.out.println(txt.toLowerCase());

        // mengembalikan nilai ke 

        System.out.println(txt.indexOf("sih"));


        // concat string 
        String namaDepan = "nama depan";
        String namaBelakang = "nama belakang";

        
        

    }
    
}
