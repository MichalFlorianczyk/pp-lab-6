
import java.util.ArrayList;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Maciej", 6000.0, 1, "2022-01-01", "Junior Developer");
        Worker worker2 = new Worker("Robert", 4800.0, 2, "2023-03-15", "Senior Developer");
        Worker worker3 = new Worker("Kamil", 9400.0, 3, "2020-12-10", "Tester");
        Manager manager = new Manager("Michael", 5000.0, 5, "2019-05-10", "Team Head");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);

        for (Employee emp : employees) {
            System.out.println(emp.getName() + " (ID: " + emp.hashCode() + ") has code: " + emp.hashCode());
        }

        System.out.println("Comparing workers with the same ID:");
        for (Employee emp : employees) {
            if (worker1.equals(emp)) {
                System.out.println(worker1.getName() + " and " + emp.getName() + " are equal.");
            }
        }
    }
}
