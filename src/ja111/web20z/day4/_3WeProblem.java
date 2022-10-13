package ja111.web20z.day4;

public class _3WeProblem {
    //create an employee class. POJO
    //name, salary
    //create an object using param const. : Employee("empName", "salary");
 //100 -> 110
    //change the value of salary using a setter method.
    //display all the values (name, salary) using getter.
    public static void main(String[] args) {
        Employee employee= new Employee("Putin", 100);
        employee.setSalary(110);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
    }
}
