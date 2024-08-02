import java.io.Serializable;
import java.util.Scanner;

public class Motorcycle implements MotorVehicle, Serializable {
    private static final long serialVersionUID = 1L;
    
    private String make;
    private String model;
    private int year;
    private int numWheels;
    private String motorcycleType;

    public Motorcycle(String make, String model, int year) {
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
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void setMotorcycleType(String motorcycleType) {
        if (motorcycleType.equalsIgnoreCase("sport") || motorcycleType.equalsIgnoreCase("cruiser") || motorcycleType.equalsIgnoreCase("off-road")) {
            this.motorcycleType = motorcycleType;
        } else {
            throw new IllegalArgumentException("Invalid motorcycle type. Choose from sport, cruiser, or off-road.");
        }
    }

    @Override
    public String getMotorcycleType() {
        return motorcycleType;
    }

    public static Motorcycle createMotorcycle(Scanner scanner) {
        System.out.print("Enter make: ");
        String make = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Motorcycle motorcycle = new Motorcycle(make, model, year);

        while (true) {
            System.out.print("Enter number of wheels: ");
            if (scanner.hasNextInt()) {
                motorcycle.setNumWheels(scanner.nextInt());
                scanner.nextLine(); // consume newline
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number of wheels.");
                scanner.nextLine(); // consume invalid input
            }
        }

        while (true) {
            System.out.print("Enter type of motorcycle (sport, cruiser, off-road): ");
            try {
                motorcycle.setMotorcycleType(scanner.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return motorcycle;
    }
}
