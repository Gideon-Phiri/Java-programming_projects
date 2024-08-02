import java.io.Serializable;
import java.util.Scanner;

public class Truck implements TruckVehicle, Serializable {
    private static final long serialVersionUID = 1L;
    
    private String make;
    private String model;
    private int year;
    private double cargoCapacity;
    private String transmissionType;

    public Truck(String make, String model, int year) {
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
    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void setTransmissionType(String transmissionType) {
        if (transmissionType.equalsIgnoreCase("manual") || transmissionType.equalsIgnoreCase("automatic")) {
            this.transmissionType = transmissionType;
        } else {
            throw new IllegalArgumentException("Invalid transmission type. Choose from manual or automatic.");
        }
    }

    @Override
    public String getTransmissionType() {
        return transmissionType;
    }

    public static Truck createTruck(Scanner scanner) {
        System.out.print("Enter make: ");
        String make = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Truck truck = new Truck(make, model, year);

        while (true) {
            System.out.print("Enter cargo capacity (in tons): ");
            if (scanner.hasNextDouble()) {
                truck.setCargoCapacity(scanner.nextDouble());
                scanner.nextLine(); // consume newline
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid cargo capacity.");
                scanner.nextLine(); // consume invalid input
            }
        }

        while (true) {
            System.out.print("Enter transmission type (manual, automatic): ");
            try {
                truck.setTransmissionType(scanner.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return truck;
    }
}
