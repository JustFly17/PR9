package ru.mirea.gibo1.pr9;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(250, "Ferrari", 10);
        vehicle.move();

        Boat boat = new Boat(100,"Cruiser", 15, 30);
        System.out.println("Расстояние, пройденное " + boat.getName() + " за время t: " + boat.move());
        boat.sell();
    }
}
