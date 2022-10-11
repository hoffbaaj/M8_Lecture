import java.util.Scanner;

public class Main
{
    // Class variables go here and are visible to the methods below main

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        sayHello(); // Prints Hello 1 time
        System.out.println("\n spacer \n");
        sayHello(10); // Prints Hello however many times I choose
        sayMsg("Life sucks", 35);

        int myFav = getRangedInt(console, "Enter your fav int", 1, 100);
        int myFavDoubled = doubleIt(myFav);
        System.out.println("Doubled is : " + myFavDoubled);

        int year = getInt(console, "Enter an int");
        {
            System.out.println("You said the year is: " + year);
        }

    }
    // User defined Methods go here and are static
    public static void sayHello()
    {
        System.out.println("Hello");
    }

    public static void sayHello(int times)
    {
        for(int rep = 0; rep < times; rep++)
            System.out.println("Hello");
    }

    public static void sayMsg(String msg, int times)
    {
        for(int rep = 0; rep < times; rep++)
            System.out.println(msg);
    }

    public static int doubleIt(int toBeDoubled)
    {
        int doubledVal = toBeDoubled * 2;

        return doubledVal;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retval = low - 1;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + "{ " + low + " - " + high + "]: ");
            if (pipe.hasNextLine())
            {
                retval = pipe.nextInt();
                pipe.nextLine();
                if (retval >= low && retval <= high)
                {
                    System.out.println("\nYou said your val is " + retval);
                    done = true;
                }
                else
                {
                    System.out.println("You said your val is " + retval + " but that is out of range [" + low + " - " + high + "]");
                }
            }
            else // did not have an int
            {
                trash = pipe.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        } while (!done);

        return retval;

    }


 public static int getInt(Scanner pipe, String prompt)
    {
        int year = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            if (pipe.hasNextLine())
            {
                year = pipe.nextInt();
                pipe.nextLine();
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        } while (!done);

        return year;

    }

}