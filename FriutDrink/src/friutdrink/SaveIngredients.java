package friutdrink;

import java.util.Scanner;

public class SaveIngredients {
    Scanner sc = new Scanner(System.in);
    ValuesIngredients valuesIngredients = new ValuesIngredients();
    // strawberry
    public void IntoIngredients() {
        do {
            try {
                System.out.println("\nPlease into the value in ml for strawberries. This must be greater than 150 ");
                valuesIngredients.setStrawberry(Integer.parseInt(sc.nextLine()));
            } catch (NumberFormatException e) {
                System.out.println("\nEl valor ingresado no es correcto");
            }
        } while (valuesIngredients.getStrawberry() < 150);

    // banana
    do {
        try {
            System.out.println("\nPlease into the value in ml for banana. This must be greater than 150 ");
            valuesIngredients.setBanana(Integer.parseInt(sc.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("\nEl valor ingresado no es correcto");
        }
    } while (valuesIngredients.getBanana() < 150);
    



    // mango
    do {
        try {
            System.out.println("\nPlease into the value in ml for mango. This must be greater than 150 ");
            valuesIngredients.setMango(Integer.parseInt(sc.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("\nEl valor ingresado no es correcto");
        }
    } while (valuesIngredients.getMango() < 150);
    // ice
    do {
        try {
            System.out.println("\nPlease into the value in ml for ice. This must be greater than 150 ");
            valuesIngredients.setIce(Integer.parseInt(sc.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("\nEl valor ingresado no es correcto");
        }
    } while (valuesIngredients.getIce() < 150);
    // condensedMilk
    do {
        try {
            System.out.println("\nPlease into the value in ml for condensed milk. This must be greater than 150 ");
            valuesIngredients.setCondensedMilk(Integer.parseInt(sc.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("\nEl valor ingresado no es correcto");
        }
    } while (valuesIngredients.getCondensedMilk() < 150);
    // sugar

    do {
        try {
            System.out.println("\nPlease into the value in ml for sugar. This must be greater than 150 ");
            valuesIngredients.setSugar(Integer.parseInt(sc.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("\nEl valor ingresado no es correcto");
        }
    } while (valuesIngredients.getSugar() < 150);
    }

}
