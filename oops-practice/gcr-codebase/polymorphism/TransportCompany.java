class Vehicle {
    String vehicleName;

    Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    void fuelCost(int km) {
        System.out.println("Fuel Cost");
    }
}

class Car extends Vehicle {
    Car(String name) {
        super(name);
    }

    @Override
    void fuelCost(int km) {
        System.out.println(vehicleName + " Fuel Cost = ₹" + (km * 8));
    }
}

class Bus extends Vehicle {
    Bus(String name) {
        super(name);
    }

    @Override
    void fuelCost(int km) {
        System.out.println(vehicleName + " Fuel Cost = ₹" + (km * 20));
    }
}

class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }

    @Override
    void fuelCost(int km) {
        System.out.println(vehicleName + " Fuel Cost = ₹" + (km * 3));
    }
}

// Added without changing existing classes
class ElectricCar extends Vehicle {
    ElectricCar(String name) {
        super(name);
    }

    @Override
    void fuelCost(int km) {
        System.out.println(vehicleName + " Charging Cost = ₹" + (km * 2));
    }
}

public class TransportCompany {
    public static void main(String[] args) {

        Vehicle fleet[] = {
                new Car("Honda City"),
                new Bus("Volvo Bus"),
                new Bike("Royal Enfield"),
                new ElectricCar("Tesla")
        };

        int km = 50;

        for (Vehicle v : fleet) {

            if (v instanceof Car) {
                Car c = (Car) v;
                c.fuelCost(km);
            } else if (v instanceof Bus) {
                Bus b = (Bus) v;
                b.fuelCost(km);
            } else if (v instanceof Bike) {
                Bike bk = (Bike) v;
                bk.fuelCost(km);
            } else if (v instanceof ElectricCar) {
                ElectricCar ec = (ElectricCar) v;
                ec.fuelCost(km);
            }
        }
    }
}