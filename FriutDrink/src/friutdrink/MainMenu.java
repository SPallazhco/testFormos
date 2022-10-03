package friutdrink;

import java.util.Scanner;

public class MainMenu {
    Scanner sc = new Scanner(System.in);
    public int opcionesMenu(){
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
}
