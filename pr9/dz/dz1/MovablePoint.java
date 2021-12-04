package ru.mirea.gibo1.pr9.dz.dz1;

public class MovablePoint implements Movable {
    int x;
    int y;
    private  int xSpeed;
    private int ySpeed;

    public void moveUp() {
        System.out.println("up");
    }
    public void moveDown() {
        System.out.println("down");
    }
    public void moveRight() {
        System.out.println("right");
    }
    public void moveLeft() {
        System.out.println("left");
    }

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }


    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
}
