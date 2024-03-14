package java_oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_java {

    /*
        reguler expresion adalah rangkaian larakter yg membentuk pola pencarian , saat anda 
        anda mencari data dalam text, anda bisa menggunakan pola pencarian ini untuk menjelaskan 
        apa yg anda cari 


        => expresi reguler dapat di gunkana untuk melkukan semua jenis operasi pencarian text dan pengganitan text
        
        => java tidak emmiliki kelas reguler expression bawaan , namun kita dapat mengimport paket 


        => paket paket yg bisa di gunakan untuk regex
            => Pattern
            => Matcher
            => PatternSyntaxException




     */

     public static void main(String[] args){
        Pattern pattern  = Pattern.compile("Nanonano", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher("n");


        boolean matcherFound = matcher.find();

        if(matcherFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match Not found");
        }


     }
}
