import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class CafeUtil {

    public int getStreakGoal(){
        int numweeks = 10;
        int suma = 0;
        for ( int i = 0; i <= numweeks ; i++){
            suma +=i;
        }
        return suma;
    }

    public double getOrderTotal(double[] prices){
        double sumaOrden = 0;
        for (int i = 0; i < prices.length; i++){
            sumaOrden += prices[i];
        }
        return sumaOrden;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa tu nombre: ");
        String userName = scanner.nextLine();
        System.out.println("Hola " + userName);
        System.out.println("Hay "+ customers.size() + " personas frente a ti");
        customers.add(userName);
        System.out.println(customers);
    }
    
}