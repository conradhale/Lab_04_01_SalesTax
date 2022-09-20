public class Main {
  public static void main(String[] args) {
    double purchasePrice = 10.50;
    double taxRate = 0.05;
    System.out.println("The price of your purchase is: " + purchasePrice);
    double taxCost = purchasePrice * taxRate;
    System.out.println("The sales tax on your purchase is: " + taxCost);

  }
}