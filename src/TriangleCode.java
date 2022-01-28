import java.util.Scanner;

//This program can calculate the hypotenuse of a triangle using the pythagoras theorem

public class TriangleCode {
    public static void main(String[] args) {
        RightAngleTriangle rat1 = new RightAngleTriangle();
        RightAngleTriangle rat2 = new RightAngleTriangle();
        rat1.opposite = 7;
        rat1.adjacent = 5;
        rat1.hypotenuse = 8.602325267042627;
        System.out.println(rat1.opposite);
        System.out.println(rat1.adjacent);
        System.out.println(rat1.hypotenuse);
        //System.out.println(rat1.rightAngle);
        System.out.println(rat1.getArea());
        rat2.opposite = 4;
        rat2.adjacent = 3;
        rat2.hypotenuse = 5;
        System.out.println(rat2.opposite);
        System.out.println(rat2.adjacent);
        System.out.println(rat2.hypotenuse);
        System.out.println(rat2.rightAngle);
        options();
    }

    public static void options() {
        Scanner option = new Scanner(System.in);
        boolean i = true;
        do {
            try {
                String interFace = ("\n----PICK AN OPTION----\nOption 1: Calculate the side length of a right angle triangle " +
                        "\nOption 2: Check if three side lengths can make a triangle " +
                        "\nOption 3: Calculate the angles of a triangle " +
                        "\nOption 4: Calculate the area of a triangle " +
                        "\nOption 5: Exit ");
                System.out.println(interFace);
                int firstOption = option.nextInt();
                if (firstOption == 1) {
                    System.out.println("Which side do you want to calculate?" +
                            "\nOption 1: Opposite(A)" +
                            "\nOption 2: Adjacent(B)" +
                            "\nOption 3: Hypotenuse(C)");
                    int secondOption = option.nextInt();
                    if (secondOption == 1) {
                        System.out.println("This is the Pythagoras theorem to calculate the Opposite side (A^2 = C^2 - B^2)");
                        System.out.print("Input a number to represent the Hypotenuse side (C in cm): ");
                        float hypotenuse1 = option.nextFloat();
                        System.out.print("Input a number to represent the Adjacent side (B in cm): ");
                        float adjacent1 = option.nextFloat();
                        i = false;
                        sideLengthOfOpposite(hypotenuse1, adjacent1);
                    }
                    if (secondOption == 2) {
                        System.out.println("This is the Pythagoras theorem to calculate the Adjacent side (B^2 = C^2 - A^2)");
                        System.out.print("Input a number to represent the Hypotenuse side (C in cm): ");
                        float hypotenuse2 = option.nextFloat();
                        System.out.print("Input a number to represent the Opposite side (A in cm): ");
                        float opposite2 = option.nextFloat();
                        i = false;
                        sideLengthOfAdjacent(hypotenuse2, opposite2);
                    }
                    if (secondOption == 3) {
                        System.out.println("This is the Pythagoras theorem to calculate the Hypotenuse (A^2 + B^2 = C^2)");
                        System.out.print("Input a number to represent the Opposite side (A in cm): ");
                        float opposite3 = option.nextFloat();
                        System.out.print("Input a number to represent the Adjacent side (B in cm): ");
                        float adjacent3 = option.nextFloat();
                        i = false;
                        sideLengthOfHypotenuse(opposite3, adjacent3);
                    }
                }
                if (firstOption == 2) {
                    System.out.println("Can three given side lengths make a triangle or not using:" +
                            "\n(A + B) > C" +
                            "\n(A + C) > B" +
                            "\n(B + C) > A");
                    Scanner input = new Scanner(System.in);
                    System.out.print("Input a number to represent the Opposite side (A in cm): ");
                    float side1 = input.nextFloat();
                    System.out.print("Input a number to represent the Adjacent side (B in cm): ");
                    float side2 = input.nextFloat();
                    System.out.print("Input a number to represent the Hypotenuse side (C in cm): ");
                    float side3 = input.nextFloat();
                    i = false;
                    existenceOfTriangle(side1, side2, side3);
                }
                if (firstOption == 3) {
                    System.out.println("Searching for the right Triangle using angles a(in degrees) + b(in degrees) + c(in degrees) = 180degrees + Triangle" +
                            "\nYou can input 2 or 3 angles and the program will work out what triangle contains the given angles" + "\n");
                    Scanner input = new Scanner(System.in);
                    System.out.print("Input first angle: ");
                    float angle1 = input.nextFloat();
                    System.out.print("Input second angle: ");
                    float angle2 = input.nextFloat();
                    System.out.print("Input third angle or 0 if unknown: ");
                    float angle3 = input.nextFloat();
                    i = false;
                    triangleAngles(angle1, angle2, angle3);
                }
                if (firstOption == 4) {
                    System.out.println("Calculating the area of a Triangle");
                    Scanner input = new Scanner(System.in);
                    System.out.print("Input the base(cm): ");
                    float base = input.nextFloat();
                    System.out.print("Input the height(cm): ");
                    float height = input.nextFloat();
                    i = false;
                    areaOfTriangle(base, height);
                }
                if (firstOption == 5) {
                    quit();
                }
            }
            catch (Exception exception) {
                System.out.print("INVALID input please try again\n");
                i = true;
            }
        }
        while (i);
    }

    public static void sideLengthOfOpposite(float x, float y) {
        Scanner reOption = new Scanner(System.in);
        if (x > y || x == 0) {
            double sum = (x * x) - (y * y);
            //System.out.println("This is a test; answer before square rooting: " + sum);
            sum = Math.sqrt(sum);
            System.out.println("the Opposite side length of this triangle is " + sum + "cm" + "\n");
            return;
        } else
            System.out.println("\nThe Hypotenuse must be greater than 0 and the Adjacent side. Please try again correctly.");
        System.out.print("Input a number to represent the Hypotenuse side (c in cm): ");
        float x2 = reOption.nextFloat();
        System.out.print("Input a number to represent the Adjacent side (b in cm): ");
        float y2 = reOption.nextFloat();
        sideLengthOfOpposite(x2, y2);
        options();
    }

    public static void sideLengthOfAdjacent(float x, float y) {
        Scanner reOption = new Scanner(System.in);
        if (x > y || x == 0) {
            double sum = (x * x) - (y * y);
            //System.out.println("This is a test; answer before square rooting:" + sum2);
            sum = Math.sqrt(sum);
            System.out.println("the Adjacent side length of this triangle is " + sum + "cm" + "\n");
            return;
        } else
            System.out.println("\nThe Hypotenuse must be greater than 0 and the Opposite side. Please try again correctly.");
        System.out.print("Input a number to represent the Hypotenuse side (c in cm): ");
        float x2 = reOption.nextFloat();
        System.out.print("Input a number to represent the Opposite side (a in cm): ");
        float y2 = reOption.nextFloat();
        sideLengthOfAdjacent(x2, y2);
        options();
    }

    public static void sideLengthOfHypotenuse(float x, float y) {
        double sum = (x * x) + (y * y);
        //System.out.println("This is a test; answer before square rooting:" + sum3);
        sum = Math.sqrt(sum);
        System.out.println("the Hypotenuse of this triangle is " + sum + "cm" + "\n");
        options();
    }

    public static void existenceOfTriangle(float x, float y, float z) {
        if ((x + y) > z && (y + z) > x && (z + x) > y) {
            System.out.println("This triangle exists");
            options();
        } else
            System.out.println("This triangle doesn't exist");
        options();
    }

    public static void triangleAngles(float x, float y, float z) {
        Scanner reOption = new Scanner(System.in);
        if (x > 1 && y > 1 && z > 1 && x < 179 && y < 179 && z < 179) {
            if (x == 90 || y == 90 || z == 90) {
                System.out.println("The angles are: " + x + "-degrees, " + y + "-degrees, " + z + "-degrees");
                System.out.println("The triangle is an Right-Angle Triangle" + "\n");
                options();
            }
            if (x == y && y == z) {
                System.out.println("The angles are: " + x + "-degrees, " + y + "-degrees, " + z + "-degrees");
                System.out.println("The triangle is an Equilateral Triangle" + "\n");
                options();
            }
            if (x == y || y == z || z == x) {
                System.out.println("The angles are: " + x + "-degrees, " + y + "-degrees, " + z + "-degrees");
                System.out.println("The triangle is an Isosceles Triangle" + "\n");
                options();
            } else {
                System.out.println("The angles are: " + x + "-degrees, " + y + "-degrees, " + z + "-degrees");
                System.out.println("the triangle is a Scalene Triangle" + "\n");
                options();
            }
        }
        if (x > 1 && y > 1 && x < 179 && y < 179 && z == 0) {
            float tempSum;
            tempSum = y + x;
            z = 180 - tempSum;
            System.out.println("The third angle is " + z + "-degrees");
            if (x == 90 || y == 90 || z == 90) {
                System.out.println("The angles are: " + x + "-degrees, " + y + "-degrees, " + z + "-degrees");
                System.out.println("The triangle is an Right-Angle Triangle" + "\n");
                options();
            }
            if (x == y && y == z) {
                System.out.println("The angles are: " + x + "-degrees, " + y + "-degrees, " + z + "-degrees");
                System.out.println("The triangle is an Equilateral Triangle" + "\n");
                options();
            }
            if (x == y || y == z || z == x) {
                System.out.println("The angles are: " + x + "-degrees, " + y + "-degrees, " + z + "-degrees");
                System.out.println("The triangle is an Isosceles Triangle" + "\n");
                options();
            } else {
                System.out.println("The angles are: " + x + "-degrees, " + y + "-degrees, " + z + "-degrees");
                System.out.println("the triangle is a Scalene Triangle" + "\n");
                options();
            }
        }
        else
            System.out.println("The first and second angles must be greater than 1 and less than 179. please Try again correctly.");
        System.out.print("Input first angle: ");
        float x2 = reOption.nextFloat();
        System.out.print("Input second angle: ");
        float y2 = reOption.nextFloat();
        System.out.print("Input third angle or 0 if unknown: ");
        float z2 = reOption.nextFloat();
        triangleAngles(x2, y2, z2);
        options();
    }

    public static void areaOfTriangle(float height, float base) {
        Scanner input = new Scanner(System.in);
        System.out.println("The equation for working out the area of a Triangle:" +
                "\narea = (base x height) / 2\n");
        float area;
        area = (height * base) / 2;
        System.out.println("The area(cm^2) of the triangle is " + area + "cm^2" + "\n");
        System.out.println("Would you like to use the area of this triangle to calculate ...: y/n");
        String juhi = input.nextLine();
        if (juhi == "y") {
            return;
        }
        if (juhi == "n") {
            options();
        }
    }

    public static void quit() {
        System.exit(5);
    }
}