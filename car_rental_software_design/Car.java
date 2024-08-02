import java.io.Serializable;
import java.util.Scanner;

public class Car implements CarVehicle, Serializable {
    private static final long serialVersionUID = 1L;
    
    private String make;
    private String model;
    private int year;
    private int numDoors;
    private String fuelType;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public int getNumDoors() {
        return numDoors;
    }

    @Override
    public void setFuelType(String fuelType) {
        if (fuelType.equalsIgnoreCase("petrol") || fuelType.equalsIgnoreCase("diesel") || fuelType.equalsIgnoreCase("electric")) {
            this.fuelType = fuelType;
        } else {
            throw new IllegalArgumentException("Invalid fuel type. Choose from petrol, diesel, or electric.");
        }
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    public static Car createCar(Scanner scanner) {
        System.out.print("Enter make: ");
        String make = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Car car = new Car(make, model, year);

        while (true) {
            System.out.print("Enter number of doors: ");
            if (scanner.hasNextInt()) {
                car.setNumDoors(scanner.nextInt());
                scanner.nextLine(); // consume newline
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number of doors.");
                scanner.nextLine(); // consume invalid input
            }
        }

        while (true) {
            System.out.print("Enter fuel type (petrol, diesel, electric): ");
            try {
                car.setFuelType(scanner.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return car;
    }
}
