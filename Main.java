import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Seba", 6000, 1, "2022-01-01", "Barista");
        Worker worker2 = new Worker("Karol", 6800, 2, "2023-03-15", "Barista");
        Worker worker3 = new Worker("Lena", 8400, 2, "2020-12-10", "Kelnerka");
        Worker worker4 = new Worker("Michał", 10400, 4, "2020-12-10", "Kelner");
        Worker worker5 = new Worker("Karolina", 7500, 4, "2020-12-10", "Kelner");
        Worker worker6 = new Worker("Jakub", 9800, 6, "2020-12-10", "Kelner");

        Manager manager1 = new Manager("Michael", 2000, 5, "2019-05-10", "Kierownik");
        Manager manager2 = new Manager("John", 16000, 7, "2019-05-10", "Menadżer");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(worker6);
        employees.add(manager1);
        employees.add(manager2);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
            if (emp instanceof Manager) {
                totalManagerSalary += emp.getSalary();
            } else if (emp instanceof Worker) {
                totalWorkerSalary += emp.getSalary();
            }
        }

        System.out.println("Całkowita suma pensji wszystkich pracowników: " + totalSalary);
        System.out.println("Całkowita suma pensji wszystkich menedżerów: " + totalManagerSalary);
        System.out.println("Całkowita suma pensji wszystkich pracowników: " + totalWorkerSalary);

        Map<Integer, List<Employee>> idMap = new HashMap<>();
        for (Employee emp : employees) {
            int id = emp.hashCode();
            if (!idMap.containsKey(id)) {
                idMap.put(id, new ArrayList<>());
            }
            idMap.get(id).add(emp);
        }

        for (Map.Entry<Integer, List<Employee>> entry : idMap.entrySet()) {
            int id = entry.getKey();
            List<Employee> employeesWithSameId = entry.getValue();
            if (employeesWithSameId.size() > 1) {
                System.out.println("Obiekty o identyfikatorze " + id + ":");
                for (Employee emp : employeesWithSameId) {
                    System.out.println("- " + emp.getName() + ", stanowisko: " + emp.getPosition());
                }
            }
        }
    }
}