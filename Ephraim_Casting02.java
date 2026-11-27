public class Ephraim_Casting02 {
    public static void main(String[] args) {

        double price = 99.99;
        int wholePrice = (int) price;
        System.out.println(price + " -> " + wholePrice);

        int letterCode = 65;
        char letter = (char) letterCode;
        System.out.println(letterCode + " -> " + letter);

        int bigNumber = 300;
        byte smallNumber = (byte) bigNumber;
        System.out.println(bigNumber + " -> " + smallNumber);

        long population = 5000000000L;
        int people = (int) population;
        System.out.println(population + " -> " + people);

        char grade = 'B';
        int gradeCode = (int) grade;
        System.out.println(grade + " -> " + gradeCode);
    }
}