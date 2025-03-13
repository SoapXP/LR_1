import java.util.ArrayList;

public class EmployeeManagement {

    // Hard Code
    private static final String COMPANY_NAME = "Завод №1";

    public static void main(String[] args) {
        // Magic Numbers
        Employee emp1 = new Employee("Иванов Иван", 10000);  // Magic number
        Employee emp2 = new Employee("Петров Петр", 5000);   // Magic number

        // Copy-Paste Programming
        Employee emp3 = new Employee("Сидоров Сидор", 10000);

        Employee emp4 = new Employee("Александров Алексей");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        // Lasagna Code
        if (employees.size() > 0) {
            for (Employee emp : employees) {
                if (emp.getSalary() > 0) {
                    if (emp.getName() != null) {
                        System.out.println("Сотрудник: " + emp.getName() + ", ЗП: " + emp.getSalary());
                    }
                }
            }
        }

        // Soft Code
        String empData = "Иванов Иван;10000,Петров Петр;5000";
        String[] empArray = empData.split(",");
        for (String data : empArray) {
            String[] empInfo = data.split(";");
            String name = empInfo[0];
            int salary = Integer.parseInt(empInfo[1]);
            System.out.println("Имя: " + name + ", ЗП: " + salary);
        }

        // Spaghetti Code
        if (employees.size() == 4 || employees.size() > 10) {
            for (Employee emp : employees) {
                if (emp.getSalary() == 10000 && emp.getName().contains("Иван")) {
                    System.out.println("Это Иванов Иван, зарплата 10000");
                } else if (emp.getSalary() == 5000 && emp.getName().contains("Петр")) {
                    System.out.println("Это Петров Петр, зарплата 5000");
                } else if (emp.getName().equals("Александров Алексей")) {
                    System.out.println("Это Александров Алексей, но зарплата не указана");
                }
            }
        } else if (employees.size() < 2) {
            System.out.println("Слишком мало сотрудников");
        } else if (employees.size() > 2) {
            System.out.println("Достаточно сотрудников для работы");
        }

        // God Object
        Employee boss = new Employee("Босс", 50000);
        boss.manageEmployees();
    }
}
