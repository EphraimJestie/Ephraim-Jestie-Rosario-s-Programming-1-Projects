import java.util.*;

public class Ephraim_ColorRange {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a wavelength");
        double wavelength = input.nextDouble();

        if (wavelength >= 380 && wavelength < 450)
        {
            System.out.println("The color is Violet");
        }
        else if (wavelength >= 450 && wavelength < 495)
        {
            System.out.println("The color is Blue");
        }
        else if (wavelength >= 495 && wavelength < 570)
        {
            System.out.println("The color is Green");
        }
        else if (wavelength >= 570 && wavelength < 590)
        {
            System.out.println("The color is Yellow");
        }
        else if (wavelength >= 590 && wavelength < 620)
        {
            System.out.println("The color is Orange");
        }
        else if (wavelength >= 620 && wavelength < 750)
        {
            System.out.println("The color is Red");
        }
        else
        {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }
    }
}  