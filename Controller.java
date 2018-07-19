/**
 * Controlls the flow of the project through main.
 * 
 * @author Rozelle 
 */
public class Controller
{
   public static void main(String args[])
   {
       ListOfExams listOfExams = new ListOfExams();
       listOfExams.displayList();
       
       SeatAllotment seatAllotment = new SeatAllotment();
       seatAllotment.allotSeats();
   }
}
