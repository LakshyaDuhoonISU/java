//Q18

class Employee {
    private String name, address, job_title;
    private double salary;

    Employee() {
        name = "John Doe";
        address = "123, XYZ Street";
        job_title = "Software Developer";
        salary = 50000;
    }

    Employee(String name, String address, String job_title, double salary) {
        this.name = name;
        this.address = address;
        this.job_title = job_title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getJobTitle() {
        return job_title;
    }

    public double getSalary() {
        return salary;
    }

    public String generatePerformanceReport() {
        return ("No performance report available");
    }

    public double calculateBonus() {
        return 0.0;
    }
}

class Manager extends Employee {
    private int numberOfSubordinates;

    Manager() {
        super();
        numberOfSubordinates = 5;
    }

    Manager(String name, String address, String job_title, double salary, int numberOfSubordinates) {
        super(name, address, job_title, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public double calculateBonus() {
        return 0.15 * getSalary();
    }

    public void manageProject() {
        System.out.println("Project is managed by " + getName());
    }

    public String generatePerformanceReport() {
        return (getName() + ". Rating: Excellent");
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    Developer() {
        super();
        programmingLanguage = "Java";
    }

    Developer(String name, String address, String job_title, double salary, String programmingLanguage) {
        super(name, address, job_title, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public double calculateBonus() {
        return 0.1 * getSalary();
    }

    public void writeCode() {
        System.out.println(getProgrammingLanguage() + " code is being written by " + getName());
    }

    public String generatePerformanceReport() {
        return (getName() + ". Rating: Good");
    }
}

public class EmployeeInherit {
    public static void main(String[] args) {
        Manager emp1 = new Manager("Bob", "789, PQR Street", "Project Manager", 70000, 10);
        Developer emp2 = new Developer("Charlie", "101, LMN Street", "Software Developer", 50000, "Python");

        System.out.println("Employee 1:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Address: " + emp1.getAddress());
        System.out.println("Job Title: " + emp1.getJobTitle());
        System.out.println("Salary: " + emp1.getSalary());
        System.out.println("Number of Subordinates: " + emp1.getNumberOfSubordinates());
        System.out.println("Performance Report: " + emp1.generatePerformanceReport());
        System.out.println("Bonus: " + emp1.calculateBonus());
        emp1.manageProject();
        System.out.println();

        System.out.println("Employee 2:");
        System.out.println("Name: " + emp2.getName());
        System.out.println("Address: " + emp2.getAddress());
        System.out.println("Job Title: " + emp2.getJobTitle());
        System.out.println("Salary: " + emp2.getSalary());
        System.out.println("Programming Language: " + emp2.getProgrammingLanguage());
        System.out.println("Performance Report: " + emp2.generatePerformanceReport());
        System.out.println("Bonus: " + emp2.calculateBonus());
        emp2.writeCode();
    }
}
