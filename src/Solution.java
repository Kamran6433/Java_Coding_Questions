import java.util.Scanner;

class Solution {
    public static void main(String[] args){
        Scanner question = new Scanner(System.in);//Creates a scanner object
        System.out.println("Input first number: ");
        int userInput1 = question.nextInt(); //Reads user input
        System.out.println("Input Second number: ");
        int userInput2 = question.nextInt();
        System.out.println("Input Third number: ");
        int userInput3 = question.nextInt();
        System.out.println("Input Fourth number: ");
        int userInput4 = question.nextInt();

        if (userInput1 == userInput2 && userInput2 == userInput3 && userInput3 == userInput4) {
            System.out.println("Equal!");
            }
        else {
            System.out.println("Not Equal!");
        }
    }
}
