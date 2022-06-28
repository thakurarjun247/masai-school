package os101.web16.LLDProblems;
//Design a rest. mgmt. system
//1. asking clarifying questions(requirements analysis)
//2. identify the core objects
//3. identify the relationship
//4. Core abstractions
//5. Implementations

import java.awt.*;
import java.util.List;

public class RestaurentSystem {
}
//Use case diagram? actor(waiter), action(takeOrder)
//Class Diagram: UML Conventions
//Activity Diagrams


class Restaurent{
    private String name;
    List<Branch> branches;

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


class Chef{}
class Kitchen{
    List<Chef> chefs;
}