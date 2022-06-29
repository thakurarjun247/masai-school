package os101.web16.LLDProblems;
//Design a rest. mgmt. system
//1. asking clarifying questions(requirements analysis)
//2. identify the core objects
//3. identify the relationship
//4. Core abstractions
//5. Implementations

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RestaurentSystem {
}
//Use case diagram? actor(waiter), action(takeOrder)
//Class Diagram: UML Conventions
//Activity Diagrams


class Restaurent{
    private String name;
    List<Branch> branches;
    //manager's use case
    public boolean addBranch(Branch branch){
        branches.add(branch);
        return true;
    }
}
class Branch{
    String name;
    Address address;
    Kitchen kitchen;
    Menu menu;
}

class Address{}
class Menu{
    int menuID;
    String title;
    String description;
    List<MenuSection> menuSections;

    void addMenuSection(MenuSection menuSection){}
    void removeMenuSection(MenuSection menuSection){}
    List<MenuSection> seeAllMenuSections(){
        return menuSections;
    }
}

class MenuSection{
    int menuSectionID;
    List<MenuItem> menuItems;
    void addMenuItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }
}

class MenuItem{
    int menuItemId;
    String name;
    String description;
    double price;
}


class Chef extends Employee{

    Chef(){
        orders=new LinkedList<Order>();
    }
    Queue<Order> orders;

    boolean takeOrder(Order order){
        //LocalDateTime shiftEnds; if shift ended
        //return false;
        orders.add(order);
        return true;
    }
}
class Account{
    String id;
    String password; // this more
    Address address;
    AccountStatus accountStatus;
}
enum AccountStatus{PREMIUM, PENDING, CLOSED, SUSPENDED}
class Kitchen{
    List<Chef> chefs;
}
class Meal{
    int mealId;
    List<MenuItem> menuItems;
    public boolean addItems(MenuItem menuItem){
        if(menuItems.contains(menuItem))
            return false;
        menuItems.add(menuItem);
        return true;
    }
}
class Order{
    private int orderId;
    Meal[] meals;
    OrderStatus orderStatus;
    private LocalDateTime creationDate;
    private Table table;
    Waiter waiter;
    Chef chef;
}
enum OrderStatus {PLACED, CANCELLED, COOKING, SERVED, PENDING}
class Table{}
class Waiter extends Employee{

} // inheritence
abstract class Person{
    private String name, email, phone;
}

abstract class Employee extends Person{
    int employeeId;
    LocalDate doj;
}
//HOW TO STORE/MANAGE PASSWORDS?

