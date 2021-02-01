package ru.geekbrains.TheFifthLesson;

public class Employee {
    public String fullName;
    public String position;
    public long phone;
    public String email;
    public double salary;
    public int age;

    public Employee (String fullName, String position, long phone, String email, double salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.phone = phone;
        this.email = email;
        this.salary  = salary;
        this.age = age;
    }

    public void showObject(){
        System.out.println("Full name: " + fullName + '\n' +
                            "Position: " + position + '\n' +
                            "Phone: " + phone + '\n' +
                            "Email: " + email + '\n' +
                            "Salary: " + salary + '\n' +
                            "Age: " + age);
    }

}
