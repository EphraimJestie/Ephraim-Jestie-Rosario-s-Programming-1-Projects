
public class Ephraim_ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total;
        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        total = (price * quantity) * tax;
         //to change the answer just make it True or False
        boolean outOfStock = false;

        if (quantity > 1) 
         {
            itemDesc = "Shirts";
            message = custName + " wants to purchase " + quantity + " " + itemDesc;
         }

        if (outOfStock == true) 
         {
            System.out.println("Sorry, this item is out of stock.");
         } 
          else 
          {
            System.out.println(message);
            System.out.println("Total cost: $" + total);
          }
          
    }
}
