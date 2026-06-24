interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is preparing and cooking food.");
    }
}

class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter is taking orders and serving customers.");
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {

        Chef chef = new Chef("Rahul", 1);
        Waiter waiter = new Waiter("Aman", 2);

        System.out.println("Chef Details:");
        chef.displayInfo();
        chef.performDuties();

        System.out.println("\nWaiter Details:");
        waiter.displayInfo();
        waiter.performDuties();
    }
}