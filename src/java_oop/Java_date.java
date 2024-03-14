package java_oop;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Java_date {



    /* 
      java tidak memiliki kelas tanggal bawaan . tetapi kita dapty mengimpor java.time agar berfungsi 
      dengan api tanggal dan waktu 

      class 
      => Localdate
      => LolalTime
      => LocalDateTime
      => DateTimeFormater




     */


     public static void main(String[] args){

        // fungsi tanggal saat ini
        LocalDate myObj = LocalDate.now();

        // fungsi waktu saat ini
        LocalDateTime myObjTime = LocalDateTime.now();

        // fungsi date 

        System.out.println(myObj);
        System.out.println(myObjTime);


     }
    
}
