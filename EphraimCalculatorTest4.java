class EphraimCalculator4 {

    private double tax;
    private double tip;

    public EphraimCalculator4(double tax, double tip) {
        this.tax = tax;
        this.tip = tip;
    }

    public double findTotal(String name, double mealPrice, double sharedMeal) {
        double price = mealPrice + sharedMeal;
        double total = price * (1 + tax + tip);
        System.out.println(name + ": $" + total);
        return total;
    }
}

public class EphraimCalculatorTest4 {

    public static void main(String[] args) {

        EphraimCalculator4 calc = new EphraimCalculator4(0.05, 0.15);

        double tableTotal = 0;
        tableTotal += calc.findTotal("Lisa", 10, 0);
        tableTotal += calc.findTotal("Alyssa", 12, 0);
        tableTotal += calc.findTotal("William", 9, 0);
        tableTotal += calc.findTotal("Alan", 8, 0);
        tableTotal += calc.findTotal("Gary", 7, 0);
        tableTotal += calc.findTotal("Alex", 15, 0);
        tableTotal += calc.findTotal("Jian", 11, 0);
        tableTotal += calc.findTotal("Bruce", 30, 0);
        System.out.println("Table Total: " + tableTotal);

        double share = (15 + 30) / 6.0;

        double newTableTotal = 0;
        newTableTotal += calc.findTotal("Lisa", 10, share);
        newTableTotal += calc.findTotal("Alyssa", 12, share);
        newTableTotal += calc.findTotal("William", 9, share);
        newTableTotal += calc.findTotal("Alan", 8, share);
        newTableTotal += calc.findTotal("Gary", 7, share);
        newTableTotal += calc.findTotal("Jian", 11, share);
        System.out.println("Table Total (without Alex and Bruce) : " + newTableTotal);
    }
}