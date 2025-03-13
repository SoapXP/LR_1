// God Object: Слишком много ответственности в одном классе.
public class Employee {
    private String name;
    private int salary;

    // Constructor Overload
    public Employee(String name, int salary) {
        // Stub
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
        // Magic Number
        this.name = name;
        this.salary = 0;  // Magic number
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    // God Object
    public void manageEmployees() {
        System.out.println("Менеджмент сотрудников");
    }

    // Duplicate Code
    public void printEmployeeDetails() {
        System.out.println("Имя сотрудника: " + name + ", зарплата: " + salary);
    }
}
