package ru.mirea.kabo0222.task2;
import java.util.*;
public class TestBall {
    public static void main(String[] args) {
        Ball ob1 = new Ball(0.0, 0.0, 15.0, "Black");
        System.out.println(ob1);

        ob1.setX(5.0);
        ob1.setY(2.0);
        ob1.setR(20.0);
        ob1.setColour("Blue");

        System.out.println(ob1);
    }
}