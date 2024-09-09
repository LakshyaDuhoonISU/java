// hierarchical inheritance employee

class Employee {
    private String name, address, title;
    private double salary;

    Employee() {
        this.name = "John";
        this.address = "Bangalore";
        this.title = "Software Engineer";
        this.salary = 100000;
    }

    Employee(String name, String address, String title, double salary) {
        this.name = name;
        this.address = address;
        this.title = title;
        this.salary = salary;
    }

    public double calculateBonus() {
        return 0.0;
    }

    public String getPerfomanceReport() {
        return ("No performance report available");
    }

    public void getEmployeeName() {
        System.out.println("Employee Name: " + this.name);
    }

    public void getEmployeeAddress() {
        System.out.println("Employee Address: " + this.address);
    }

    public void getEmployeeTitle() {
        System.out.println("Employee Title: " + this.title);
    }

    public void getEmployeeSalary() {
        System.out.println("Employee Salary: " + this.salary);
    }
}

class Manager extends Employee {
    private double bonus;

    Manager() {
        super();
        this.bonus = 50000;
    }

    Manager(String name, String address, String title, double salary, double bonus) {
        super(name, address, title, salary);
        this.bonus = bonus;
    }

    public double calculateBonus() {
        return this.bonus;
    }

    public String getPerfomanceReport() {
        return ("Performance report of Manager");
    }
}

class Developer extends Employee {
    private double bonus;

    Developer() {
        super();
        this.bonus = 20000;
    }

    Developer(String name, String address, String title, double salary, double bonus) {
        super(name, address, title, salary);
        this.bonus = bonus;
    }

    public double calculateBonus() {
        return this.bonus;
    }

    public String getPerfomanceReport() {
        return ("Performance report of Developer");
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee manager = new Manager("John", "Bangalore", "Manager", 100000, 50000);
        manager.getEmployeeName();
        manager.getEmployeeAddress();
        manager.getEmployeeTitle();
        manager.getEmployeeSalary();
        System.out.println("Bonus: " + manager.calculateBonus());
        System.out.println(manager.getPerfomanceReport());
        System.out.println();

        Employee developer = new Developer("John", "Bangalore", "Developer", 100000, 20000);
        developer.getEmployeeName();
        developer.getEmployeeAddress();
        developer.getEmployeeTitle();
        developer.getEmployeeSalary();
        System.out.println("Bonus: " + developer.calculateBonus());
        System.out.println(developer.getPerfomanceReport());
    }
}
