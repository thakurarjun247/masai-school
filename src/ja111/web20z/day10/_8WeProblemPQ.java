package ja111.web20z.day10;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _8WeProblemPQ {
    //create a class called CustomerOrder which is used to store customer order details:
    //private int orderId;
    //    private double orderAmount;
    //    private String customerName;

    //add three objects to this PQ:
        //orderId:3, orderAmount:50.0, customerName:customer3
        //orderId:2, orderAmount:300.0, customerName:customer2
        //orderId:1, orderAmount:100.0, customerName:customer1

    //order => highest orders amount is served first.
    public static void main(String[] args) {
        CustomerOrder c1 = new CustomerOrder(1, 100.0, "customer1");
        CustomerOrder c2 = new CustomerOrder(3, 50.0, "customer3");
        CustomerOrder c3 = new CustomerOrder(2, 300.0, "customer2");
        Queue<CustomerOrder> customerOrders=new PriorityQueue<>( new CustomerOrderComparator());
        customerOrders.add(c1);
        customerOrders.add(c2);
        customerOrders.add(c3);
        while(!customerOrders.isEmpty())
            System.out.println(customerOrders.poll()
            );



    }
}

class CustomerOrderComparator implements Comparator<CustomerOrder>{


    @Override
    public int compare(CustomerOrder o1, CustomerOrder o2) {
        if(o1.getOrderAmount()==o2.getOrderAmount())
            return 0;
        else if(o1.getOrderAmount() > o2.getOrderAmount())
            return -1;
        else
            return +1;
    }
}
class CustomerOrder {
    private int orderId;
    private double orderAmount;
    private String customerName;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public CustomerOrder(int orderId, double orderAmount, String customerName) {
        this.orderId = orderId;
        this.orderAmount = orderAmount;
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "CustomerOrder{" +
                "orderId=" + orderId +
                ", orderAmount=" + orderAmount +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}