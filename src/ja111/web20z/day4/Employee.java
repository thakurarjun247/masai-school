package ja111.web20z.day4;

public class Employee {
    private String name;
    private Integer salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Employee(){}

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }
}
