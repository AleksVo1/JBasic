package main.java.oop.homeWork6;

public class Employee {

    private String firstName;
    private String lastName;
    private String position;
    private int salaryPerHour;

    public Employee(String firstName, String lastName, String position, int salaryPerHour) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salaryPerHour = salaryPerHour;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
