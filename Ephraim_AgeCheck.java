public class Ephraim_AgeCheck {

    public static void main(String[] args) {
        int myAge = 19;

            /*The problem here is both of the if statements that could run when myAge is 16, 
            Using if/else makes sure its only one message is printed*/
        if (myAge >= 16) 
        {
            System.out.println("I'm old enough to have a driver's license!");
        }
            else 
          {
               System.out.println("I'm not old enough yet... :*(");
          }
          
    }
}
