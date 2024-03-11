package java_oop.encapsulation;


public class Car extends Vehicele{
    private String modelName = "Mustang";
    

    public static void main(String[] args){
        Car myCar = new Car();
        
        // memanggil honk dari kelas vehicle
        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.modelName);
    }
   
}
