/*
    Angelino dela Cruz
    201911720
    angelino.delacruz@bellevuecollege.edu
    The following program asks the user input an integer that determines a shape, they then are asked to input several values of said shape's dimension
    and outputs the area, it also compares the area of another shape that does the same thing (asking for user input).
    The program uses user-input, if-else statements, return methods...
 */


import java.util.*;

public class AreaComparisons {
    static Scanner scn = new Scanner(System.in); // 1) rectangle 2) triangle 3) circle
    static String shape1, shape2;
    static double area1, area2;

    public static void main(String[] args) {
        isShape1();
        isShape2();
        printResults();
    }

    public static void isShape1() {
        System.out.print("Define a first shape 1) 2) 3): ");
        int shapeNum = scn.nextInt();
        if (shapeNum == 1) {
            shape1 = "rectangle";
            area1 = areaOfRec(getDimensions(shape1, "width"), getDimensions(shape1, "height"));
        } else if (shapeNum == 2) {
            shape1 = "triangle";
            area1 = areaOfTriangle(getDimensions(shape1, "base"), getDimensions(shape1, "height"));
        } else if (shapeNum == 3) {
            shape1 = "circle";
            area1 = areaOfCircle(getDimensions(shape1, "radius"));
        }
        System.out.println();
    }

    public static void isShape2() {
        System.out.print("Define a second shape 1) 2) 3): ");
        int shapeNum = scn.nextInt();
        if (shapeNum == 1) {
            shape2 = "rectangle";
            area2 = areaOfRec(getDimensions(shape2, "width"), getDimensions(shape2, "height"));
        } else if (shapeNum == 2) {
            shape2 = "triangle";
            area2 = areaOfTriangle(getDimensions(shape2, "base"), getDimensions(shape2, "height"));
        } else if (shapeNum == 3) {
            shape2 = "circle";
            area2 = areaOfCircle(getDimensions(shape2, "radius"));
        }
        System.out.println();
    }

    public static void printResults() {
        System.out.printf(shape1 + " area: %.2f\n", area1);
        System.out.printf(shape2 + " area: %.2f\n", area2);
        
        if (area1 > area2) {
            double timesBigger = (double) area1 / area2;
            System.out.printf("The area of " + shape1 + " seems %.2f times bigger than the area of the " + shape2 + ".", timesBigger);
        } else if (area2 > area1) {
            double timesBigger = (double) area2 / area1;
            System.out.printf("The area of " + shape2 + " seems %.2f times bigger than the area of the " + shape1 + ".", timesBigger);
        } else {
            System.out.println("The two shapes have the same area.");
        }
    }

    public static double getDimensions(String shape, String dimensionType) {
        System.out.print(shape + " " + dimensionType + ": ");
        return scn.nextDouble();
    }

    public static double areaOfRec(double w, double h) {
        return w * h;
    }

    public static double areaOfTriangle(double w, double h) {
        return w * h * 0.5;
    }

    public static double areaOfCircle(double r) {
        return r * r * Math.PI;
    }

}
