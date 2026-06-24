class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate,
                 String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate,
                   String trackingNumber,
                   String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class OrderManagement {
    public static void main(String[] args) {

        Order o = new Order(1001, "24-06-2026");

        ShippedOrder so = new ShippedOrder(
                1002,
                "24-06-2026",
                "TRK12345");

        DeliveredOrder d = new DeliveredOrder(
                1003,
                "24-06-2026",
                "TRK67890",
                "26-06-2026");

        System.out.println("Order Status: " + o.getOrderStatus());
        System.out.println("Shipped Status: " + so.getOrderStatus());
        System.out.println("Delivered Status: " + d.getOrderStatus());
    }
}