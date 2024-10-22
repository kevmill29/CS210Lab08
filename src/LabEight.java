import java.util.Scanner;

public class LabEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyName namePrint = new MyName();
        System.out.print("1.--------------------");
        namePrint.printName();
        namePrint.printName();
        namePrint.printName();
        namePrint.printName();
        System.out.print("\n2 & 3.---------------------\nEnter a word: ");

        String userWord = input.nextLine();
        QuestionTwo(userWord);
        System.out.print("\n4.-----------------------\nEnter a number: ");
        int n = input.nextInt();
        int sum = calcSum(n);
        System.out.print("The number you entered is: "+n+" and the sum of the first numbers is "+ sum);
        input.close();
    }


    public static class MyName {
        public void printName() {
            System.out.print("\nMy name");
        }
    }


        public static void QuestionTwo(String word){

            for(int i = 0; i<5; i++){
            System.out.print(word+"\n");
            }

        }

        public static int calcSum(int n){
            int sum = 0;
            for(int j= 0; j<=n; j++){
                sum+=j;
            }
            return sum;
        }
}
