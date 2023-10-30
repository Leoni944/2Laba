package ru.mirea.kabo0222.task3;

public class Main {
    public static void main(String[] args) {
        Point ob1 = new Point(5.0, 2.0);
        System.out.println(ob1);
        Circle ob2 = new Circle(new Point(5.0, 2.0), 10.0);
        System.out.println(ob2);
        ob2.move();
        System.out.println("Площадь окружности: " + ob2.ploshad());
        System.out.println("Длина окружности: " + ob2.dlina());
        System.out.println(ob2);
    }
}

