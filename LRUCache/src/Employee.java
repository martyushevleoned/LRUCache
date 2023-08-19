import java.util.Objects;

public class Employee{
    private final String name;
    private String post;
    private int salary;

    public Employee(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return name + "\t" + post + "\t" + salary;
    }
}
