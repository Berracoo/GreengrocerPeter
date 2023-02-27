import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // starting scanner class so that we can take input from users.
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the amount of pear in kilograms : ");
        double pearKg = input.nextDouble();
        System.out.println();
        System.out.print("Please enter the amount of apple in kilograms : ");
       // entering an input
        double appleKg = input.nextDouble();
        System.out.println();
        System.out.print("Please enter the amount of tomato in kilograms : ");
        double tomatoKg = input.nextDouble();
        System.out.println();
        System.out.print("Please enter the amount of banana in kilograms : ");
        double bananaKg = input.nextDouble();
        System.out.println();
        System.out.print("Please enter the amount of eggplant in kilograms : ");
        double eggplantKg = input.nextDouble();
        System.out.println();
        input.close();
        // creating and assigning a Linked List telling it will only hold
        // double values.
        LinkedList<Double> fruitList = new LinkedList<Double>();
        fruitList.add(pearKg);
        fruitList.add(appleKg);
        fruitList.add(tomatoKg);
        fruitList.add(bananaKg);
        fruitList.add(eggplantKg);
        LinkedList<Double> priceList = new LinkedList<Double>();
        priceList.offer(2.14);
        priceList.offer(3.67);
        priceList.offer(1.11);
        priceList.offer(0.95);
        priceList.offer(5.00);
        double lastPrice = 0;
        for(int i = 0; i<5; i++){
            // with sumOfMoney we will get the element values of the lists
            double sumOfMoney = fruitList.get(i) * priceList.get(i);
            lastPrice += sumOfMoney;
        }
        // we did not include that into the loop so that it will give us
        // only the final result.
        System.out.println("Your debt is : " +lastPrice);





    }
}