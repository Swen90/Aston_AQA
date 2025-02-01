package org.example2;

public class Employee {
    private String firstName;
    private String lastName;
    private String middleName;
    private String position;
    private String email;
    private long phoneNumber;
    private int salary;
    private int age;

    public Employee(String firstName, String lastName, String middleName, String position, String email,
                    long phoneNumber, int salary, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printMessage(Employee employee){
        System.out.println("Имя: " + employee.firstName + " " + "Фамилия: " + employee.lastName + " " + "Отчество: " + employee.middleName + " " + "Должность: " + employee.position + " " + "email: " +
                employee.email + " " + "Номер телефона: " +  employee.phoneNumber + " " + "Зарплата: " + employee.salary + " " + "Возраст: " + employee.age);
    }
}
