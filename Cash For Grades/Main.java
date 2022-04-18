import java.util.Scanner;

/**
 * NRCC will award each student a cash prize that is calculated as 150
 * times the student’s grade point average. If a student has a grade 
 * point average of 3.76, the college will
 * award that student $564.0.
 *
 * @author (Andrew Choi)
 * @version (09/21/2020)
 */

public class Main
{
    //constant for cash prize 
    private static final int bonus = 150; 

    /*
     * The main method will prompt the user for their name and GPA.
     * The main method will pass the student’s name and GPA to the computeAward method.
     */
    public static void main(String args[]) 
    {
        //Create scanner 
        Scanner scanner = new Scanner(System.in);

        //User enters name
        System.out.println("Enter Name");

        //Name is stored
        String userName = scanner.nextLine(); 

        //User enters gpa
        System.out.println("Enter GPA"); 

        //GPA is stored
        double userGPA = scanner.nextDouble(); 

        //user's name and gpa are passed to computeAward
        computeAward(userName, userGPA); 

        //Scaner closes
        scanner.close();
    }

    /*
     * Calculate the student’s award and output a descriptive message
     * that includes the student’s name, GPA and their award.
     */
    public static void computeAward(String name, double gpa) 
    {
        //Bonus (150) is multiplied to gpa 
        double award = (bonus * gpa);

        //Prints decription of name, gpa, and award amount
        System.out.println(name + ", since your GPA is " + gpa + ", NRCC will give you an award of: $" + award); 
    }
}