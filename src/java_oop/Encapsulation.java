package java_oop;

public class Encapsulation {

    /*
        arti dari enkapsilation adalah untuk memastikan bahwa data sensitif di sembunyikan dari pengguna
        untuk mencapai hala tersbut , anda harus 
            => mendeklarasikan variable / attribut sebagai private
            => menyediakan metode get dan set public untuk mengakses dan memperbarui nilai private variable
            => 


        => mengapa enkapsulation
            => kontrol lebih baik atas attribut dan metode kelas
            => attribut dapat di buat read only (jika hanya menggunakan get methode), atau write only (jika hanya
            menggunakan  set metode )
            => fleksibel : programer dapat mengubah satu bagian kode tanpa mempengaruhi bagian lainya  
            => pengingkatan kemanan data 
            => 

            
            
     */

     private String name;

     // Getter
     public String getName(){
        return name;
     }

     public void setName(String newName) {
        this.name = newName;
     }
    
}
