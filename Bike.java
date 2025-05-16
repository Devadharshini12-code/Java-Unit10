public class Bike {
    // attributes
    String brand;
    String model;
    int year;
    // constructor usage
    public Bike(String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    // method to display bike information
    public void displayInfo(){
        System.out.println("Bike Info :" + year + ""  +  brand  +  ""  + model);
    }
    // method
    public void startEngine(){
        System.out.println(brand + " "  + model + "'s engine started!");
    }
    // main to create and use objects
    public static void main(String[] args) {
        // create objects
        Bike bike1= new Bike("TVS" , "ntorq", 2018);
        Bike bike2= new Bike("Yamaha" , "FZ16", 2010);
        // methods use
        bike1.displayInfo();
        bike1.startEngine();

        bike2.displayInfo();
        bike2.startEngine();
    }
}
