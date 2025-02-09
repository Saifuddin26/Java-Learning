import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car {
    private String carId;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailable;

    public Car(String carId, String brand, String model, double basePricePerDay) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = true;

    }

    public double calulatePrice(int rentalprice) {
        double rent = basePricePerDay * rentalprice;
        return rent;

    }

    public String getCarId() {
        return carId;
    }

    public String getbrand() {
        return brand;
    }

    public String getmodel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rent() {
        isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }
}

class Customer {
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }
}

class Rental {
    private Car car;
    private Customer customer;
    private int days;

    public Rental(Car car, Customer customer, int days) {
        this.car = car;
        this.customer = customer;
        this.days = days;

    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }
}

public class carRentalSystem {
    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;
}

public carRentalSystem(){
    cars = new ArrayList<>();
    customers = new ArrayList<>();
    rentals = new ArrayList<>();

    public Car addCars(Car car) {
        cars.add(car);
    }

    public Customer addCustomers(Customer customer) {
        customers.add(customer);
    }

    public void rentCar(Car car, Customer customer, int days) { // will use small letter car as we are calling method of
                                                                // car object
        if (car.isAvailable()) {
            car.rent();
            rentals.add(new Rental(car, customer, days));

        } else {
            System.out.println("Car is not available for rent");
        }
    }
}
