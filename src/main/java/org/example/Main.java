package org.example;
import java.util.*;
import java.util.Arrays;


public class Main {
   public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int input ;
        Vehicle[] vehicles = new Vehicle[20];
        vehicles[0] = new Vehicle(101121, "Ford Explorer","Red", 45000,13500);
        vehicles[1] = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        vehicles[2] = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        vehicles[3] = new Vehicle(101124,"Honda Civic","White",70000,7500);
        vehicles[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        vehicles[5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);

        do {
        System.out.println("\nWhat do you want to do?");
        System.out.println("  1 - List all vehicles");
        System.out.println("  2 - Search by make/model");
        System.out.println("  3 - Search by price range");
        System.out.println("  4 - Search by color");
        System.out.println("  5 - Add a vehicle");
        System.out.println("  6 - Quit");
        System.out.print("Enter your choice: ");
        input = scan.nextInt();
            switch (input) {
                case 1:
                    listAllVehicles(vehicles);
                    break;
                case 2:
                    searchMakeModel();
                    break;
                case 3:
                    colorSearch();
                    break;
                case 4:
                    findVehiclesByPrice();
                    break;
                case 5:
                    addAVehicle(vehicles);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("\nInvalid input");
            }
        }while(input < 7);
        scan.close();
    }
    public static void colorSearch() {
    }
    public static void searchMakeModel() {
    }
    public static void addAVehicle(Vehicle[] vehicles) {
        int add = 1;
        int counter = 0;
        for (Vehicle count : vehicles){
            if(count != null){
                counter++;
            }
        }
        System.out.print("\nEnter Vehicle ID: ");
        long id = scan.nextLong();
        System.out.print("Enter Vehicle make/model: ");
        String model = scan.next();
        System.out.print("Enter Vehicle Color: ");
        String vcolor = scan.next();
        System.out.print("Enter Vehicle Odometer: ");
        int odometer = scan.nextInt();
        System.out.print("Enter Vehicle Price: ");
        float vprice = scan.nextFloat();

        vehicles[counter] = new Vehicle(id,model,vcolor,odometer,vprice);
        System.out.println("Vehicle Added");
        for( int i = 0; i < counter ; i++){
            vehicles[i].getVehicleID();
            vehicles[i].getMakeModel();
            vehicles[i].getColor();
            vehicles[i].getOdometerReading();
            vehicles[i].getPrice();

        }
    }

    public static void findVehiclesByPrice() {
    }

    public static void listAllVehicles(Vehicle[] vehicles){
        int counter = 0;
        for (Vehicle count : vehicles){
            if(count != null){
                counter++;
            }
        }
        System.out.println("\nInventory Max Capacity: " + vehicles.length);
        System.out.printf("Number of Vehicles: %d\n", counter);
        try {
            for (Vehicle vehicle : vehicles) {
                vehicle.list();
            }
        }catch (NullPointerException e){

        }

    }

    

}