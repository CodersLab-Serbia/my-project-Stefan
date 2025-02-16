package pl.coderslab.JavaExercisesDayTwoObjectOrientPrograming.Methods;

public class Car {
    private String brand = "";
    private String model = "";
    private double price = 0.0;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Price: " + price;
    }
}