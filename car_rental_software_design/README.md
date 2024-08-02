<a name="top"></a>

# Car Rental Software Design

![Hero Image](./gitimg/hero.png)

⭐ Star me on GitHub — it will motivates me a lot!

[![Share](https://img.shields.io/badge/share-000000?logo=x&logoColor=white)](https://x.com/intent/tweet?text=Check%20out%20this%20project%20on%20GitHub:%20https://github.com/Gideon-Phiri/Java-programming_projects/tree/main/car_rental_software_design)
[![Share](https://img.shields.io/badge/share-1877F2?logo=facebook&logoColor=white)](https://www.facebook.com/sharer/sharer.php?u=https://github.com/Gideon-Phiri/Java-programming_projects/tree/main/car_rental_software_design)
[![Share](https://img.shields.io/badge/share-0A66C2?logo=linkedin&logoColor=white)](https://www.linkedin.com/sharing/share-offsite/?url=https://github.com/Gideon-Phiri/Java-programming_projects/tree/main/car_rental_software_design)
[![Share](https://img.shields.io/badge/share-FF4500?logo=reddit&logoColor=white)](https://www.reddit.com/submit?title=Check%20out%20this%20project%20on%20GitHub:%20https://github.com/Gideon-Phiri/Java-programming_projects/tree/car_rental_software_design)
[![Share](https://img.shields.io/badge/share-0088CC?logo=telegram&logoColor=white)](https://t.me/share/url?url=https://github.com/Gideon-Phiri/Java-programming_projects/tree/main/car_rental_software_design&text=Check%20out%20this%20project%20on%20GitHub)

## Table of Contents

1. [Introduction](#introduction)
2. [Project Structure](#project-structure)
3. [Interfaces](#interfaces)
   - [Vehicle](#vehicle)
   - [CarVehicle](#carvehicle)
   - [MotorVehicle](#motorvehicle)
   - [TruckVehicle](#truckvehicle)
4. [Classes](#classes)
   - [Car](#car)
   - [Motorcycle](#motorcycle)
   - [Truck](#truck)
   - [VehicleDatabase](#vehicledatabase)
   - [Main](#main)
5. [Running the Program](#running-the-program)
6. [Error Handling](#error-handling)
7. [Feedback and Contributions](#-feedback-and-contributions)
8. [License](#-license)
9. [Contacts](#%EF%B8%8F-contacts)
10. [Author](#author)
11. [Course Instructor](course-instructor)

## 🚘 Introduction

Welcome to the Vehicle Information System for the Car Rental Agency. This application is designed to manage different types of vehicles, including Cars, Motorcycles, and Trucks. The system ensures consistency and enforces common behavior across these vehicle types using interfaces. This documentation provides an in-depth look at the classes, methods, and functionalities of the application, as well as instructions on how to run and interact with the program.

## Project Structure

- **Vehicle.java**: Interface defining the common properties of all vehicles.
- **CarVehicle.java**: Interface for additional properties specific to cars.
- **MotorVehicle.java**: Interface for additional properties specific to motorcycles.
- **TruckVehicle.java**: Interface for additional properties specific to trucks.
- **Car.java**: Class implementing the CarVehicle and Vehicle interfaces.
- **Motorcycle.java**: Class implementing the MotorVehicle and Vehicle interfaces.
- **Truck.java**: Class implementing the TruckVehicle and Vehicle interfaces.
- **VehicleDatabase.java**: Class for saving and loading vehicle data.
- **Main.java**: Main class to run and interact with the application.

## Interfaces

### Vehicle

The `Vehicle` interface defines the basic properties that all vehicle types must implement.

### CarVehicle

The `CarVehicle` interface extends `Vehicle` and adds methods specific to cars.

### MotorVehicle

The `MotorVehicle` interface extends `Vehicle` and adds methods specific to motorcycles.

### TruckVehicle

The `TruckVehicle` interface extends `Vehicle` and adds methods specific to trucks.

## Classes

### Car

The `Car` class implements the `CarVehicle` interface and includes additional properties such as the number of doors and fuel type. The `createCar` method facilitates interactive creation of a car object.

### Motorcycle

The `Motorcycle` class implements the `MotorVehicle` interface and includes additional properties such as the number of wheels and motorcycle type. The `createMotorcycle` method facilitates interactive creation of a motorcycle object.

### Truck

The `Truck` class implements the `TruckVehicle` interface and includes additional properties such as cargo capacity and transmission type. The `createTruck` method facilitates interactive creation of a truck object.

### VehicleDatabase

The `VehicleDatabase` class provides methods for saving and loading vehicle data to and from a file, ensuring that vehicle information is retained across program reboots.

### Main

The `Main` class contains the main method that drives the program. It provides a menu for users to create vehicles, display vehicle information, and manage the vehicle data.

## Running the Program

To run the Vehicle Information System:

1. **Compile the Code:**
   Ensure all `.java` files are compiled. You can use a Java IDE or the command line:

   Open a terminal (Command Prompt or PowerShell for Windows, Terminal for macOS or Linux)
   Ensure `Git` is installed

   Visit [https://git-scm.com](https://git-scm.com) to download and install `console Git` if not already installed

   Clone the repository

   ```sh
   git clone https://github.com/Gideon-Phiri/Java-programming_projects.git
   ```

   Navigate to the project directory

   ```sh
   cd car_rental_software_design
   ```

   ```sh
   javac *.java
   ```

2. **Run the Program:**
   Execute the main class:

   ```sh
   java Main
   ```

3. **Interact with the Program:**
   - Follow the on-screen prompts to create new vehicles (Cars, Motorcycles, Trucks).
   - Choose options to display all stored vehicles of each type.
   - The system will save the vehicle data to `vehicles.dat` upon each update, ensuring persistence across sessions.

## Error Handling

- **Invalid Inputs:**
  The program includes checks for invalid inputs, such as incorrect fuel types, motorcycle types, and transmission types. Appropriate error messages guide users to provide valid inputs.

- **User Abortion:**
  Users can abort the entry process at any point by entering a special command (e.g., "0" to exit).

## 🤝 Feedback and Contributions

We've made every effort to implement all the main aspects of the app in the best possible way. However, the development journey doesn't end here, and your input is crucial for our continuous improvement.

> [!IMPORTANT]
> Whether you have feedback on features, have encountered any bugs, or have suggestions for enhancements, we're eager to hear from you. Your insights help us make this app more robust and user-friendly.

Please feel free to contribute by [submitting an issue](https://github.com/Gideon-Phiri/Java-programming_projects/issues). Each contribution helps us grow and improve.

We appreciate your support and look forward to making our product even better with your help!

## 📃 License

This Project is part of ![UoPeople](./gitimg/uopeople.png) class `programing assignments` instructed by **Sir Marcellous Simeon**

For non-commercial use, this product is available for free.

## 🗨️ Contacts

For more details about about this project and any other projects you may need assistance on, feel free to reach out to me. Am here to provide support and answer any questions you may have. Below are the best way to contact with me:

- **Email**: Send me your inquiries or support requests on [gideonphiri032@gmail.com](mailto:gideonphiri032@gmail.com).

Subscribe to my LinkedIn:

[![LinkedIn](https://img.shields.io/badge/subscribe-white.svg?logo=data:image/svg%2bxml;base64,PHN2ZyB2aWV3Qm94PSIwIDAgMjQgMjQiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+PHBhdGggZD0iTTIwLjQ0NyAyMC40NTJoLTMuNTU0di01LjU2OWMwLTEuMzI4LS4wMjctMy4wMzctMS44NTItMy4wMzctMS44NTMgMC0yLjEzNiAxLjQ0NS0yLjEzNiAyLjkzOXY1LjY2N0g5LjM1MVY5aDMuNDE0djEuNTYxaC4wNDZjLjQ3Ny0uOSAxLjYzNy0xLjg1IDMuMzctMS44NSAzLjYwMSAwIDQuMjY3IDIuMzcgNC4yNjcgNS40NTV2Ni4yODZ6TTUuMzM3IDcuNDMzYTIuMDYyIDIuMDYyIDAgMCAxLTIuMDYzLTIuMDY1IDIuMDY0IDIuMDY0IDAgMSAxIDIuMDYzIDIuMDY1em0xLjc4MiAxMy4wMTlIMy41NTVWOWgzLjU2NHYxMS40NTJ6TTIyLjIyNSAwSDEuNzcxQy43OTIgMCAwIC43NzQgMCAxLjcyOXYyMC41NDJDMCAyMy4yMjcuNzkyIDI0IDEuNzcxIDI0aDIwLjQ1MUMyMy4yIDI0IDI0IDIzLjIyNyAyNCAyMi4yNzFWMS43MjlDMjQgLjc3NCAyMy4yIDAgMjIuMjIyIDBoLjAwM3oiIGZpbGw9IiMwQTY2QzIiLz48cGF0aCBzdHlsZT0iZmlsbDojZmZmO3N0cm9rZS13aWR0aDouMDIwOTI0MSIgZD0iTTQuOTE3IDcuMzc3YTIuMDUyIDIuMDUyIDAgMCAxLS4yNC0zLjk0OWMxLjEyNS0uMzg0IDIuMzM5LjI3NCAyLjY1IDEuNDM3LjA2OC4yNS4wNjguNzY3LjAwMSAxLjAxYTIuMDg5IDIuMDg5IDAgMCAxLTEuNjIgMS41MSAyLjMzNCAyLjMzNCAwIDAgMS0uNzktLjAwOHoiLz48cGF0aCBzdHlsZT0iZmlsbDojZmZmO3N0cm9rZS13aWR0aDouMDIwOTI0MSIgZD0iTTQuOTE3IDcuMzc3YTIuMDU2IDIuMDU2IDAgMCAxLTEuNTItMi42NyAyLjA0NyAyLjA0NyAwIDAgMSAzLjQxOS0uNzU2Yy4yNC4yNTQuNDIuNTczLjUxMi45MDguMDY1LjI0LjA2NS43OCAwIDEuMDItLjA1MS4xODYtLjE5Ny41MDQtLjMuNjUyLS4wOS4xMzItLjMxLjM2Mi0uNDQzLjQ2NC0uNDYzLjM1Ny0xLjEuNTAzLTEuNjY4LjM4MlpNMy41NTcgMTQuNzJWOS4wMDhoMy41NTd2MTEuNDI0SDMuNTU3Wk05LjM1MyAxNC43MlY5LjAwOGgzLjQxMXYuNzg1YzAgLjYxNC4wMDUuNzg0LjAyNi43ODMuMDE0IDAgLjA3LS4wNzMuMTI0LS4xNjIuNTI0LS44NjUgMS41MDgtMS40NzggMi42NS0xLjY1LjI3NS0uMDQyIDEtLjA0NyAxLjMzMi0uMDA5Ljc5LjA5IDEuNDUxLjMxNiAxLjk0LjY2NC4yMi4xNTcuNTU3LjQ5My43MTQuNzEzLjQyLjU5Mi42OSAxLjQxMi44MDggMi40NjQuMDc0LjY2My4wODQgMS4yMTUuMDg1IDQuNTc4djMuMjU4aC0zLjUzNnYtMi45ODZjMC0yLjk3LS4wMS0zLjQ3NC0uMDc0LTMuOTA4LS4wOS0uNjA2LS4zMTQtMS4wODItLjYzNC0xLjM0Mi0uMzk1LS4zMjItMS4wMjktLjQzNy0xLjcwMy0uMzA5LS44NTguMTYzLTEuMzU1Ljc1LTEuNTIzIDEuNzk3LS4wNzYuNDcxLS4wODQuODQ1LS4wODQgMy44MzR2Mi45MTRIOS4zNTN6Ii8+PC9zdmc+)](https://www.linkedin.com/in/gideon-phiri22/)

## Author

- **Gideon Phiri**
- _Software Engineer_
- _[gideonphiri032@gmail.com](mailto:gideonphiri032@gmail.com)_

## Course Instructor

- **Marcellous Simeon**
- _UoPeople Course Instructor_

---

##

I look forward to assisting you and ensuring your experience with this project is successful and enjoyable!

[Back to top](#top)
