// Q13. WAP to demonstrate:
// Create an Address class with instance variables of String type:
// apptDetails
// district
// state
// country
// Create a class Person with instance variables:
// int id
// String name
// Address addr
// Create an Employee class and inherit Person class. It’s instance variables:
// String EmpId
// String Dept
// String Designation
// You have to serialize and deserialize object of Employee class

import java.io.*;

class Address implements Serializable {
    String apptDetails;
    String district;
    String state;
    String country;
    Address() {
        apptDetails = "A-101";
        district = "Mumbai";
        state = "Maharashtra";
        country = "India";
    }
}

class Person implements Serializable {
    int id;
    String name;
    Address addr;
    Person() {
        id = 1;
        name = "John Doe";
        addr = new Address();
    }
}

class Employee extends Person {
    String empId;
    String dept;
    String designation;
    Employee() {
        empId = "E101";
        dept = "IT";
        designation = "Software Engineer";
    }
}

public class EmpSerialize {
    public static void main(String[] args) {
        Employee emp = new Employee();
        try (FileOutputStream fos = new FileOutputStream("emp.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(emp);
        } catch (IOException e) {
            System.out.println("Error serializing employee: " + e);
        }
        try (FileInputStream fis = new FileInputStream("emp.ser");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println("Deserialized Employee:");
            System.out.println("ID: " + deserializedEmp.id);
            System.out.println("Name: " + deserializedEmp.name);
            System.out.println("ApptDetails: " + deserializedEmp.addr.apptDetails);
            System.out.println("District: " + deserializedEmp.addr.district);
            System.out.println("State: " + deserializedEmp.addr.state);
            System.out.println("Country: " + deserializedEmp.addr.country);
            System.out.println("EmpID: " + deserializedEmp.empId);
            System.out.println("Dept: " + deserializedEmp.dept);
            System.out.println("Designation: " + deserializedEmp.designation);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error deserializing employee: " + e);
        }
    }
}
