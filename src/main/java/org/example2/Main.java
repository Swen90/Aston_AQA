package org.example2;

public class Main {
    public static void main(String[] args) {
                Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivan","Ivanov", "Ivanovich", "Engineer",
                "ivan1212@mail.ru", 89856533534L, 70000, 29);
        employeeArray[1] = new Employee("Petr", "Petrov", "Petrovich", "Electrician",
                "dwqimi@mail.ru", 87263646363L, 60000, 31);
        employeeArray[2] = new Employee("Michail", "Blinov", "Alexandrovich", "Lead manager",
                "blinov343@mail.ru", 89736472473L, 120000, 34);
        employeeArray[3] = new Employee("Alexandr", "Pokrovsky", "Michailovich", "Senior Engineer",
                "alexalex23@mail.ru", 8987652653L, 150000, 30);
        employeeArray[4] = new Employee("Sergei", "Mironov", "Ivanovich", "Head of Department",
                "mironov12929@mail.ru", 89877236643L, 200000, 32);

        Park.Attraction attraction = new Park("Disney").new Attraction("Boat", 18, 20, "Jun 30, 2025");
        System.out.println(attraction.name + " " + attraction.ageRestriction + " " + attraction.price + " " + attraction.dateAndTime);

    }
}
