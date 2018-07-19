import java.util.*;
/**
 * List of all exams in one day displayed.
 * 
 * @author Rozelle
 */
public class ListOfExams
{
    private int day, month, year;
    
    /**
     * Used to enter date for which seating arrangement has to be done.
     * 
     */
    private void inputDate()
    {
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        do
        {
            System.out.println("Please enter valid day, month and year\n");
            flag = true;
            
            do
            {
                System.out.print("Enter day: ");
                day = scanner.nextInt();
            }while(day < 1 || day > 31);
            
            do
            {
                System.out.print("Enter month: ");
                month = scanner.nextInt();
            }while(month < 1 || month > 12);
            
            do
            {
                System.out.print("Enter year: ");
                year = scanner.nextInt();
            }while(year < 2000 || year > 2100);
            
            if(month == 2 )
            {
                if((year % 4 == 0 && day > 29) || (year % 4 != 0 && day > 28))
                    flag = false;
            }
            else
            if((month == 4 || month == 6 || month == 9 || month == 11) && day > 30)
                flag = false;
        }while(flag == false);
    }
    
    /**
     * Used to display list of all exams in a particular day.
     * 
     */
    public void displayList()
    {
        // Take date for which seating arrangement has to be done
        inputDate();
    }
}
