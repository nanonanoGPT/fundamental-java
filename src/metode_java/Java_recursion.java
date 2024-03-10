package metode_java;

public class Java_recursion {

    /*
        => rekursi adalah teknik pemanggilan fungsi itu sendiri
        => teknik ini memeberikan cara untuk memecah permasalahan rumit menjadi permasalahan sederhana yg lenih mudah
        untuk di selesaikan
        => rekursi mungkin agak rumit di pelajarin cara terbaik untuk megetahui cara kerjanya adalah dengan bereksperimen 
        denganya 
        => 



        => hati hati dalam menulis rekursif cara kerjanya sama seperti looping tapu dengan logic yg berbeda 

        
     */


     public static int sum(int k){
        if ( k>0 ) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
     }

     public static int sum1(int star, int end){
        if (end > star) {
            return end + sum1(star, end - 1);
        } else {
            return end;
        }
     }
    
}
