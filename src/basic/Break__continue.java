package basic;

public class Break__continue {


    // break di gunakan untutk menghentikan proses jika ketemu kondisi ...

    // continue di gunakan untuk melewati proses proses jika masuk kondisi
    public static void break_continue(){


        for (int i=0; i<10; i++) {
            if (i == 4) {

                // break akan menghentikan proses 
                // break;

                // continue akan melewatkan proses kondisi jika i == 4
                continue;
            }

            System.out.println(i);
        }



        int  j = 0;
        while (j < 10) {
            System.out.println(i);
            j++;
            
            if(j == 4) {
                // break;
                continue;
            }
        }



    }
    
}
