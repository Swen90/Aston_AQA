package org.example6;

public class Cat extends Animal{

    private static final int MAX_RUN_DISTANCE = 200;
    private static int catCount = 0;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        super(name);
        catCount++;
        this.appetite = appetite;
        this.isFull = false;
    }

    public Cat(String name) {
        this(name, 10);
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (distance >= 0 && distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        }
        else {
            System.out.println(name + " не сможет пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не может плыть.");
    }

    public void eat(Bowl bowl) {
        if (isFull) {
            System.out.println(name + " сыт.");
            return;
        }
        boolean success = bowl.decreaseFood(appetite);
        if (success) {
            System.out.println(name + " съел " + appetite + " еды и теперь сыт.");
            isFull = true;
        } else {
            System.out.println(name + " в миске недостаточно еды.");
        }
    }

    public boolean isFull() {
        return isFull;
    }
}