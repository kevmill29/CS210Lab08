import java.util.Scanner;

public class LabEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyName namePrint = new MyName();
        System.out.print("1.--------------------");
       for(int q= 0; q<3; q++){
           namePrint.printName();
       }

        System.out.print("\n2 & 3.---------------------\nEnter a word: ");

        String userWord = input.nextLine();
        QuestionTwo(userWord);
        System.out.print("\n4.-----------------------\nEnter a number: ");
        int n = input.nextInt();
        int sum = calcSum(n);
        System.out.print("The number you entered is: " + n + " and the sum of the first numbers is " + sum);

        System.out.print("\n5.---------------------------\n Enter your weight in pounds: ");
        int bmi = 0;
        double weight = input.nextDouble();
        System.out.print("\n Enter your height in inches: ");
        double height = input.nextDouble();
        bmi = bmiCalc(weight, height);
        System.out.print("Your BMI is: " + bmi);
        System.out.print("\n6.------------------------------\n");
        int seconds = 313297;
        int days = seconds / 86400;
        int hours = seconds % 86400 / 3600;
        int minutes = seconds % 3600 / 60;
        int modSec = seconds % 60;
        timeConv(days, hours, minutes, modSec, seconds);
        System.out.print("\n7.------------------------------\n");
        int a = 5;
        int b = 5;

        pythagTheorem(a, b);
        System.out.print("\n8.--------------------\nEnter your first name : ");
        String firstName = input.next();
        System.out.print("Enter your last name: ");
        String lastName = input.next();
        String fullName = nameEntered(firstName, lastName);
        System.out.print("Your full name is " + fullName);
        System.out.print("\n9.-------------------------\nEnter a number:");
        int num = input.nextInt();
        int factor = factorial(num);
        System.out.print("The factorial of " + num + " is " + factor);
        System.out.print("\n10.----------------\nEnter a number to see if its a prime number: ");
        int p = input.nextInt();
        boolean prime = primeNum(p);
        System.out.print(prime);
        input.close();
    }

    //Question 1
    public static class MyName {
        public void printName() {
            System.out.print("\nMy name");
        }
    }


    public static void QuestionTwo(String word) {
        //Method for question 2 and 3, passes the input through method
        //and for loop prints 5 times
        for (int i = 0; i < 5; i++) {
            System.out.print(word + "\n");
        }

    }

    //Question 4
    public static int calcSum(int n) {
        int sum = 0;
        for (int j = 0; j <= n; j++) {
            sum += j;
        }
        return sum;
    }

    //Question 5
    public static int bmiCalc(double weight, double height) {
        int bmi = (int) ((weight / (height * height)) * 703.0);
        return bmi;
    }

    //Question 6
    public static void timeConv(int days, int hours, int minutes, int modSec, int seconds) {

        System.out.println(days + ":" + hours + ":" + minutes + ":" + modSec);

    }

    //       //Question 7
    public static void pythagTheorem(int a, int b) {
        int cSquared = (a * a) + (b * b);
        double c = (Math.sqrt(cSquared));// function that gives the square root of c s
        System.out.print(a + " and " + b + " are the sides of the triangle. " + c + " is the hypotenuse.");
    }

    //Question 8
    public static String nameEntered(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    //Question 9
    public static int factorial(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //Question 10
    public static boolean primeNum(int p) {
        if (p < 1) {
            return false;
        }else if (p == 1){
            return true;
        }
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                return false; //not prime if it is divisible by a number other than itself
            }
        }
        return true;
    }
}
