package ru.mirea.gibo1.pr9;

public class Vehicle implements Movable {
    private int speed;
    private String brand;
    private int time;

    public Vehicle(int speed, String brand, int time) {
        this.speed = speed;
        this.brand = brand;
        this.time = time;
    }

    public int getSpeed() {
        return speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getTime() {
        return time;
    }

    public double move() {
        return time * speed;
    }

    public void moveUp() {
        System.out.println("Moves up");
    }

    public void moveDown() {
        System.out.println("Moves down");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", brand='" + brand + '\'' +
                " time= "+ time + '\''+
                '}';
    }
}

