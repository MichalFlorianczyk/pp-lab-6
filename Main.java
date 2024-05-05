import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 50000.0, 1);
        Worker worker = new Worker("Bob", 30000.0, 2);

        System.out.println(manager.getName() + " earns " + manager.getSalary());
        System.out.println(worker.getName() + " earns " + worker.getSalary());

        manager.work();
        worker.work();
    }
}