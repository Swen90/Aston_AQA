package org.example6;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = Math.max(food, 0);
    }

    public int getFood() {
        return food;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Добавлено " + amount + " еды. В миске стало " + food);
        } else {
            System.out.println("Нельзя добавить отрицательное количество еды!");
        }
    }

    public boolean decreaseFood(int amount) {
        if (amount <= 0) {
            return false;
        }
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }
}
