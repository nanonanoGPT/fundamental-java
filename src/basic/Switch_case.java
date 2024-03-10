package basic;

public class Switch_case {

    /*
     * dari pada menulis banyak if else pernyataan , kita bisa menggunakan switch
       
     
     case
     
     


     * penulisan switch case :
     
     

     * switch(expression) {
      
     * case x:
     * // code block
     * break;
     * case y
     * // code block
     * break;
     * default;
     * // code block
     * }
     


     */

    public static void switch_case() {

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Minggu");
                break;
            case 2:
                System.out.println("Senin");
                break;
            case 3:
                System.out.println("Selasa");
                break;
            case 4:
                System.out.println("Rabu");
                break;
            case 5:
                System.out.println("Kamis");
                break;
            case 6:
                System.out.println("Jumat");
                break;
            case 7:
                System.out.println("Sabtu");
                break;
            
            default:
                break;
        }

    }
}
