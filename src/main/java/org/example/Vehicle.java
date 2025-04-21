package org.example;

public class Vehicle {
    long vehicleID;
    String makeModel;
    String color;
    int odometerReading;
    float price;

    public Vehicle(long vehicleID, String makeModel, String color, int odometerReading, float price) {
        this.vehicleID = vehicleID;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }
    public long getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(long vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
 public void list(){

                System.out.println("\nVehicle ID: " + this.vehicleID);
                System.out.println("Vehicle Model Make: " + this.makeModel);
                System.out.println("Vehicle Color: " + this.color);
                System.out.println("Vehicle Odometer: " + this.odometerReading);
                System.out.println("Vehicle Price: " + this.price);
 }


}
