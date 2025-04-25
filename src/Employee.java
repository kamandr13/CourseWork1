import java.util.Objects;

public class Employee {
    private final int id;
    private String firstName;
    private String lastName;
    private String secondName;
    private Integer department;
    private double salary;
    private static int count = 0;

    public Employee(String lastName, String firstName, String secondName, Integer department, double salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getCount() {
        return count;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + '\n' +
                "Фамилия: " + lastName + '\n' +
                "Имя: " + firstName + '\n' +
                "Отчество: " + secondName + '\n' +
                "Отдел: " + department + '\n' +
                "Зарплата: " + salary + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(salary, employee.salary) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(secondName, employee.secondName) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, secondName, department, salary);
    }
}
