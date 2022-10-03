package friutdrink;

import java.util.Scanner;

public class Mains {
    Scanner sc = new Scanner(System.in);
    public int opcionsMenuMain(){
        int opcion = 0;
        do {
        System.out.println("\nPlease, select an option. ");
        System.out.println("1. Enter ingredients. ");
        System.out.println("2. Make a fruit drink. ");
        System.out.println("3. Inventory. ");
        System.out.println("4. Exit. ");
        System.out.println("");
        opcion = sc.nextInt();
        } while(opcion != 1  && opcion != 2 && opcion != 3  && opcion != 4);
        return opcion;
    }
    public int opcionsMakingFruitDrink(){
        int opcion = 0;
        do {
        System.out.println("\nPlease, select a fruit. ");
        System.out.println("1. Strawberry. ");
        System.out.println("2. Banana. ");
        System.out.println("3. Mango. ");
        System.out.println("4. Exit. ");
        System.out.println("");
        opcion = sc.nextInt();
        } while(opcion != 1  && opcion != 2 && opcion != 3  && opcion != 4);
        return opcion;
    }
}
