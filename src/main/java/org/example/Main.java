package org.example;
import java.util.*;
import java.util.Arrays;
//java.util.InputMismatchException;


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
                    searchMakeModel(vehicles);
                    break;
                case 3:
                    findVehiclesByPrice(vehicles);

                    break;
                case 4:
                    colorSearch(vehicles);
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
    public static void colorSearch(Vehicle[] vehicles) {

        boolean match = false;
        scan.nextLine();
        System.out.print("\nEnter Color of the vehicle: ");
        String color = scan.nextLine().toLowerCase();
        try {
            for (int i = 0; i < vehicles.length; i++ ){
                String colorSearch = vehicles[i].getColor().toLowerCase();
                if(color.equalsIgnoreCase(colorSearch) || color.startsWith(colorSearch) || color.endsWith(colorSearch)){
                    vehicles[i].list();
                    match = true;
                }
            }
        }catch (NullPointerException e){
        }
        if (!match){
            System.out.println("\nColor not found !!!");
        }


    }
    public static void searchMakeModel(Vehicle[] vehicles) {

        boolean match = false;
        int counter = 0;
        for (Vehicle count : vehicles){
            if(count != null){
                counter++;
            }
        }
        scan.nextLine();
        System.out.print("\nEnter Make/Model of the vehicle: ");
        String searchMM = scan.nextLine().toLowerCase();
try {
    for (int i = 0; i < vehicles.length; i++ ){
        String mm = vehicles[i].getMakeModel().toLowerCase();
        if(mm.equalsIgnoreCase(searchMM) || mm.startsWith(searchMM) || mm.endsWith(searchMM)){
            vehicles[i].list();
            match = true;
        }
    }
}catch (NullPointerException e){
}
        if (match == false){
            System.out.println("\nMake/Model not found !!!");
        }
    }
    public static void addAVehicle(Vehicle[] vehicles) {
        int counter = 0;
        for (Vehicle count : vehicles){
            if(count != null){
                counter++;
            }
        }
        if(counter >= vehicles.length){
            System.out.println("\nInventory is full !!\nCannot add new Vehicle");
        }else{
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
            System.out.println("\nVehicle Added 🚘 !!");
            for( int i = 0; i < counter ; i++){
                vehicles[i].getVehicleID();
                vehicles[i].getMakeModel();
                vehicles[i].getColor();
                vehicles[i].getOdometerReading();
                vehicles[i].getPrice();
            }
        }
    }
    public static void findVehiclesByPrice(Vehicle[] vehicles) {

        float minPrice, maxPrice, priceSearch;
        boolean isfound = false;

        do {
            System.out.print("\nEnter the minimum price: ");
            minPrice = scan.nextFloat();
            System.out.print("Enter the maximum price: ");
            maxPrice = scan.nextFloat();

            if(minPrice > maxPrice ){
                System.out.println("\nMinimum Price must be small than Maximum price.");
                findVehiclesByPrice(vehicles);
            }

            try {
                for (Vehicle vehicle : vehicles) {
                    priceSearch = vehicle.getPrice();
                    if (minPrice <= priceSearch && maxPrice > priceSearch) {
                        isfound = true;
                        vehicle.list();
                    }
                }
            } catch (NullPointerException e) {
            }
            if (!isfound) {
                System.out.println("\nNo Vehicle within range of the price that you input");
            }
        } while (!isfound);

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
        }catch(NullPointerException e){

        }

    }

    

}