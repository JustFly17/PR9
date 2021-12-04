package ru.mirea.gibo1.pr9.dz.dz1;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(3, 4,15,20);
        point.moveUp();
        point.moveLeft();
        MovableCircle circle = new MovableCircle(4,1,2,3,0);
        System.out.println("circle radius is"+circle.getRadius()+"center:"+circle.getCenter());
        circle.moveDown();
        circle.moveRight();
        System.out.println(circle);
    }
}