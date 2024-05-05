import java.util.ArrayList;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Maciej", 6000, 1, "2022-01-01", "Junior Developer");
        Worker worker2 = new Worker("Robert", 4800, 2, "2023-03-15", "Senior Developer");
        Worker worker3 = new Worker("Kamil", 9400, 3, "2020-12-10", "Tester");
        Worker worker4 = new Worker("Andrzej", 8400, 4, "2021-06-20", "Project Manager");

        Manager manager = new Manager("Michael", 5000, 5, "2019-05-10", "Team Head");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);

        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                    ", Position: " + employee.getPosition() +
                    ", Hire date: " + employee.getHireDate() +
                    ", Salary: " + employee.getSalary() + ")");
            employee.work();
        }
    }
}