package ru.mirea.gibo1.pr9.dz.dz1;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int
            radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "Circle (" + center.x + ", " +
                center.y + ") radius=" + radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    public void moveUp() {center.moveUp();}
    @Override
    public void moveDown() {center.moveDown();}
    @Override
    public void moveRight() {center.moveRight();}
    @Override
    public void moveLeft() {center.moveLeft();}

    @Override
    public void move() {

    }
}
