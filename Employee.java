package ru.nesterenko.se;

/**
 * Homework5
 */
public class Employee {

    public String FIO;
    public String position;
    public String mail;
    public long phone;
    public long salary;
    public int age;

    public Employee(String FIO, String position, String mail, long phone, long salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        Employee[] array = new Employee[5];
        array[0] = new Employee("Ivanov AI", "meneger", "ivanovai@volnenko.ru", 9417339, 35000, 42);
        array[1] = new Employee("Petrov BU", "designer", "petrovbu@volnenko.ru", 9176251, 0, 0);
        array[2] = new Employee("e", "e", "e", 0, 0, 0);
        array[3] = new Employee("e", "e", "e", 0, 0, 0);
        array[4] = new Employee("e", "e", "e", 0, 0, 0);
    }
 }

