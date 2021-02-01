package ru.geekbrains.TheFifthLesson;

public class Main {

    public static void main(String[] args) {
        Employee [] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "The carpenter", 89112223344L, "ivanov@mail.ru", 50000.0, 48);
        employees[1] = new Employee("Petrov Petr", "The director", 89922990000L, "petrov@mail.ru", 100000.0, 50);
        employees[2] = new Employee("Andreev Andrei", "The team lead", 89223334455L, "andreev@mail.ru", 90000.0, 30);
        employees[3] = new Employee("Dmitriev Dmitrii", "The developer", 89212121212L, "dmitriev@mail.ru", 80000.0, 23);
        employees[4] = new Employee("Alekseev Aleksei", "The teacher", 89535353535L, "alekseev@mail.ru", 20000.0, 25);

        //employees[4].showObject();
        showWhoIsOverForty(employees);
    }


    public static void showWhoIsOverForty(Employee [] employees){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age >= 40) {
                employees[i].showObject();
            }
        }
    }
}
