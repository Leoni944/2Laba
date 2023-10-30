package ru.mirea.kabo0222.task3;
import java.util.Scanner;
public class Circle {
    private Point center;
    private double r;

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void move() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите новые координаты центра окружности (x и y):");

        System.out.println("x: ");
        if (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            this.center.setX(x);
        } else {
            System.out.println("Некорректный ввод для x");
            return;
        }

        System.out.println("y: ");
        if (scan.hasNextDouble()) {
            double y = scan.nextDouble();
            this.center.setY(y);
        } else {
            System.out.println("Некорректный ввод для y");
            return;
        }

        scan.close();
    }
    public double ploshad() {
        return Math.PI * Math.pow(r, 2);
    }

    public double dlina() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", r=" + r +
                '}';
    }
}