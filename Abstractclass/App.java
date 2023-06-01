package Abstractclass;

public class App {
    public static void main(String[] args) {
  
    // todo...
    Owner ow1 = new Owner("Arsyad");
    Car c1 = new Car(ow1, "Toyota GR Yaris", 2022, 6500.0);
    c1.printDetails();
    System.out.println(" ");

    Owner ow2 = new Owner("Ardhan");
    Car c2 = new Car(ow2, "Jeep Wrangler", 1972, 6000.0);
    c2.printDetails();
    System.out.println(" ");

    Owner ow3 = new Owner("Budhi");
    Car c3 = new Car(ow3, "Mazda RX 87", 1967, 10500.0);
    c3.printDetails();
    System.out.println(" ");

    Owner ow4 = new Owner("Galuh");
    Car c4 = new Car(ow4, "Mercedes Benz 220", 1958, 5500.0);
    c4.printDetails();
    System.out.println(" ");
    }
}
