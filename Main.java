import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Manager manager = new Manager("Alice", 50000.0, 1, "2022-01-01", "Manager");
        Worker worker = new Worker("Bob", 30000.0, 2, "2022-01-15", "Worker");

        employees.add(manager);
        employees.add(worker);

        for (Employee emp : employees) {
            System.out.println(emp.getName() + " (ID: " + emp.getId() + "), Position: " + emp.getPosition() +
                    ", Hire date: " + emp.getHireDate() + ", Salary: " + emp.getSalary());
            emp.work();
        }
    }
}
