import java.util.Scanner;

public class Ephraim_StringEquality {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;

        System.out.print("Enter a name: ");
        name = input.nextLine();

        if (name.equals("Moe")) 
        {
            System.out.println("You are the king of rock and roll");
        } 
         else 
         {
            System.out.println("You are not the king");
         }

        input.close();
        
    }
}
