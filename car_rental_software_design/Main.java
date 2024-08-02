import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = VehicleDatabase.loadVehicles();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Maona Car Rental Agency");

        System.out.println("Welcome to the Vehicle Information Dashboard");

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1: Create Car");
            System.out.println("2: Create Motorcycle");
            System.out.println("3: Create Truck");
            System.out.println("4: Display All Cars");
            System.out.println("5: Display All Motorcycles");
            System.out.println("6: Display All Trucks");
            System.out.println("0: Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    vehicles.add(Car.createCar(scanner));
                    break;
                case 2:
                    vehicles.add(Motorcycle.createMotorcycle(scanner));
                    break;
                case 3:
                    vehicles.add(Truck.createTruck(scanner));
                    break;
                case 4:
                    displayCars(vehicles);
                    break;
                case 5:
                    displayMotorcycles(vehicles);
                    break;
                case 6:
                    displayTrucks(vehicles);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            VehicleDatabase.saveVehicles(vehicles);
        }

        scanner.close();
        System.out.println("Thank you for using Maona Car Rental Agency App");
    }

        private static void displayCars(List<Vehicle> vehicles) {
        System.out.println("Cars:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Make: " + car.getMake());
                System.out.println("Model: " + car.getModel());
                System.out.println("Year: " + car.getYear());
                System.out.println("Number of Doors: " + car.getNumDoors());
                System.out.println("Fuel Type: " + car.getFuelType());
                System.out.println();
            }
        }
    }

    private static void displayMotorcycles(List<Vehicle> vehicles) {
        System.out.println("Motorcycles:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                System.out.println("Make: " + motorcycle.getMake());
                System.out.println("Model: " + motorcycle.getModel());
                System.out.println("Year: " + motorcycle.getYear());
                System.out.println("Number of Wheels: " + motorcycle.getNumWheels());
                System.out.println("Type of Motorcycle: " + motorcycle.getMotorcycleType());
                System.out.println();
            }
        }
    }

    private static void displayTrucks(List<Vehicle> vehicles) {
        System.out.println("Trucks:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                System.out.println("Make: " + truck.getMake());
                System.out.println("Model: " + truck.getModel());
                System.out.println("Year: " + truck.getYear());
                System.out.println("Cargo Capacity: " + truck.getCargoCapacity() + " tons");
                System.out.println("Transmission Type: " + truck.getTransmissionType());
                System.out.println();
            }
        }
    }
}
