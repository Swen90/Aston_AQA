package org.example6;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Мурка", 10),
                new Cat("Барсик", 5),
                new Cat("Рыжик", 15),
                new Cat("Пика", 25)
        };

        Bowl bowl = new Bowl(30);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        System.out.println("\nСостояние каждого кота после первой попытки покушать:");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " — " + (cat.isFull() ? "сыт" : "голоден"));
        }

        System.out.println("\nВ миске осталось " + bowl.getFood() + " единиц еды.");

        bowl.addFood(10);

        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl);
            }
        }

        System.out.println("\nИтоговое состояние котов:");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " — " + (cat.isFull() ? "сыт" : "голоден"));
        }
        System.out.println("В миске осталось " + bowl.getFood() + " единиц еды.");

        System.out.println("\nВсего животных: " + Animal.getAnimalCount());
        System.out.println("Из них котов: " + Cat.getCatCount());
        System.out.println("Из них собак: " + Dog.getDogCount());
    }
}
