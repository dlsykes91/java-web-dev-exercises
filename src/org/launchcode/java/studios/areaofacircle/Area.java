package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Double radius;
        Scanner input;
        input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        input.close();

        Double area = Circle.getArea(radius);
        System.out.println("The area of the circle with radius of " + radius + " is: " + area);
    }
}
