public class Ephraim_Parsing01 {
    public static void main(String[] args) {

        String shirtPrice = "15";
        String taxRate = "0.05";
        String shirtQuantity = "3";

        int price = Integer.parseInt(shirtPrice);
        double tax = Double.parseDouble(taxRate);
        int quantity = Integer.parseInt(shirtQuantity);

        int subtotal = price * quantity;
        double taxAmount = subtotal * tax;
        double total = subtotal + taxAmount;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: " + taxAmount);
        System.out.println("Total: " + total);
    }
}