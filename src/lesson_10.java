import java.util.Scanner;

public class lesson_10 {

    public static void main(String[] args) {


        //count how many cups of coffee one has had over the week

        int[] coffeeArray = new int[7];

        coffeeArray[0] = 3;
        coffeeArray[1] = 2;
        coffeeArray[2] = 4;
        coffeeArray[3] = 1;
        coffeeArray[4] = 2;
        coffeeArray[5] = 0;
        coffeeArray[6] = 1;

        //this is how humans are calculating
        // int totalCofees = coffeeArray[0] + coffeeArray[1] + coffeeArray[2]...

        int coffeeCounter = 0;

        //LOOPS will help to iterate over all elements in an Array
        for (int i = 0; i < coffeeArray.length; i++) {
            coffeeCounter += coffeeArray[i];
            //cofeeCounter = coffeeCounter + coffeeArray[i];
        }
        System.out.println("Total number of coffee cups during the week: " + coffeeCounter);

//        int[][] my2DArray = {{1,2,4,7}, {11,12,13,14}, {22,23,24,25}};
//
//        System.out.println("This is an element of a row index=2 and column index=3: " + my2DArray[2][3]);


        int[][] ourSecond2DArray = {{125, 91, 90}, {55, 5, 211}, {77, 19, 21}};

        System.out.println("This is an element of a row index= 0 and column index= 0: " + ourSecond2DArray[0][0]);
        System.out.println("This is an element of a row index= 0 and column index= 1: " + ourSecond2DArray[0][1]);
        System.out.println("This is an element of a row index= 0 and column index= 2: " + ourSecond2DArray[0][2]);
        System.out.println("This is an element of a row index= 1 and column index= 0: " + ourSecond2DArray[1][0]);
        System.out.println("This is an element of a row index= 1 and column index= 1: " + ourSecond2DArray[1][1]);
        System.out.println("This is an element of a row index= 1 and column index= 2: " + ourSecond2DArray[1][2]);
        System.out.println("This is an element of a row index= 2 and column index= 0: " + ourSecond2DArray[2][0]);
        System.out.println("This is an element of a row index= 2 and column index= 1: " + ourSecond2DArray[2][1]);
        System.out.println("This is an element of a row index= 2 and column index= 2: " + ourSecond2DArray[2][2]);
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Indexes: i= " +i+ "; j= " +j+ "; value = " + ourSecond2DArray[i][j]);
            }
            System.out.println();
        }

        // "FOR EACH" loop example (always goes through all the elements)

        int[] forLoopArray = {5,6,7,1,1};
        for ( int internalValue : forLoopArray) {
            System.out.println("For loop element: " + internalValue);
        }

        // "WHILE" loop example

        int clockTime = 0;

        while (clockTime <= 24){
            System.out.println("The time is " + clockTime + " o'clock");
//            clockTime++;
            clockTime += 3;
        }


        //more complex example
        boolean runWhileLoop = true;

        while (runWhileLoop) {
            System.out.println(" variable runWhile loop is still set to be true");

            if (clockTime > 30){
                runWhileLoop = false;
            }
            clockTime++;
        }

        //MENU example w/ WHILE loop
        int menuItem = 99; // random value that is not 0



        Scanner scanner = new Scanner(System.in);

        while (menuItem != 0) {
            System.out.println("Please select an action you want to do: ");
            System.out.println("1 - write that you are smart");
            System.out.println("2 - write that you are pretty");
            System.out.println("3 - write that you are the best!");
            System.out.println("0 - Exit the application (but you are still the best!) ");

            menuItem = scanner.nextInt();

           if (menuItem == 1){
               System.out.println("You are smart!");
           }
           else if (menuItem == 2) {
               System.out.println( "You are pretty!");
           }
           else if (menuItem ==3) {
               System.out.println("You are the best!");
           }
           else {
               System.out.println("There is no such option!");
           }
        }

        int initialValue = 10;

        //WIill not run at all

        while (initialValue < 5){
            System.out.println("WHILE LOOP. Initial value < 5");
        }

        //Will run only once

        do {
            System.out.println("DO LOOP. Initial value < 5");
        }
        while ( initialValue < 5);










    }
}
