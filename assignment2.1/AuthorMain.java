// Q5

class Author {
    private String name, email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}

public class AuthorMain {
    public static void main(String[] args) {
        Author a1 = new Author("Abc", "Abc@gmail.com", 'm');
        System.out.println(a1);
        a1.setEmail("xyz@gmail.com");
        System.out.println("Name: " + a1.getName() + "\nEmail:" + a1.getEmail() + "\nGender:" + a1.getGender());
    }
}
