public class ShipCost {
    public static void main(String[] args) {
        double totCost = 39.50;
        double sCost;
        if(totCost >= 100) {
            sCost = 0;
            System.out.println("The shipping cost of an order that is $" + totCost + " is $"+sCost);
        }else{
            sCost = totCost*0.02;
            System.out.println("The shipping cost of an order that is $" + totCost + " is $"+sCost);
        }
    }
}