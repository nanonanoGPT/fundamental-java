package java_oop.inheritence;

public class Car extends Vehicle {


    private String modelName = "Mustang";

    public static void main(String[] args){



        // create a myCAR Object 
        Car myCar = new Car();


        myCar.honk();

        // brand adalah attribut dari vehicle dan bisa di askes dari car karena di set protected
        System.out.println(myCar.brand + " " + myCar.modelName);
        


    }
    
}
