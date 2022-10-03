package friutdrink;

public class FriutDrink {
    public static void main(String[] args) {
        System.out.println("Hello user, welcome.");
        boolean salir = false;
        ValuesIngredients valuesIngredients = new ValuesIngredients();
        SaveIngredients saveIngredients = new SaveIngredients();
        MakingFruitDrink makingFruitDrink = new MakingFruitDrink();
        while (!salir) {
            Mains menuPrincipal = new Mains();
            int valueOption = menuPrincipal.opcionsMenuMain();
            switch (valueOption) {
                case 1:
                    saveIngredients.IntoIngredients();
                    break;
                case 2:
                    makingFruitDrink.MakingProduct();
                    break;
                case 3:
                    System.out.println("\nStrawberry:\t\t\t" + valuesIngredients.getStrawberry() + " ml");
                    System.out.println("Banana: \t\t\t"+ valuesIngredients.getBanana() + " ml");
                    System.out.println("Mango: \t\t\t\t"+ valuesIngredients.getMango() + " ml");
                    System.out.println("Ice: \t\t\t\t"+ valuesIngredients.getIce() + " ml");
                    System.out.println("Condense Milk: \t\t\t"+ valuesIngredients.getCondensedMilk() + " ml");
                    System.out.println("Sugar: \t\t\t\t"+ valuesIngredients.getSugar() + " ml");
                    break;
                case 4:
                    System.out.println("Good Bye");
                    salir = true;
                    break;
            }
        }

    }

}
