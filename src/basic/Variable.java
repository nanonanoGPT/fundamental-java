package basic;

public class Variable {

    /* variable adalah wadah untuk menyimpan nilai data 
    di java ada berbagai variable 
    misal 


    # variable final dii gunakan seperti konstanta
       

    deklarasi variable
         => type variableName = value;

    # aturan penulisan variable
        => nama dapat berisi huruf, angka, garis_bawah, dan tanda dolar 
        => nama harus di awali dengan huruf 
        => nama harus di awali dengan huruf kecil dan tidak boleh mengandung spasi
        => nama peka terhadap huruf besar kecil 
        => 



    */

    public static void variable(){
        String name = "Nanonano";
        int umur = 22;
        int kelas;
        kelas = 2;
        char letter = 'D';
        boolean menikah = true;

        final int gaji = 10000000;

        System.out.println("nama = " + name);
        System.out.println("Umur :" + umur);
        System.out.println("kelas bpjs : " + kelas);
        System.out.println("plat nomer : " + letter);
        System.out.println("status menikah : " + menikah);
        System.out.println("gaji bulanan : " + gaji);

    }
}
