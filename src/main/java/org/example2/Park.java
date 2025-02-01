package org.example2;

public class Park {
    public  Park(String name){
        this.name = name;
    }
    String name;

    public class Attraction{
        public Attraction(String name, int ageRestriction, int price, String dateAndTime){
            this.name = name;
            this.ageRestriction = ageRestriction;
            this.price = price;
            this.dateAndTime = dateAndTime;
        }

        String name;
        int ageRestriction;
        int price;
        String dateAndTime;
    }
}
