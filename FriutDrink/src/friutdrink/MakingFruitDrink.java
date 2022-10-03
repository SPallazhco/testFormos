package friutdrink;

public class MakingFruitDrink {
    Mains mains = new Mains();
    ValuesIngredients valuesIngredients = new ValuesIngredients();
    public void MakingProduct(){
        try {
            int value = mains.opcionsMakingFruitDrink();
            switch(value){
                case 1:
                    valuesIngredients.setStrawberry(valuesIngredients.getStrawberry() - (50 * 3));
                    valuesIngredients.setIce(valuesIngredients.getIce() - (30 * 3));
                    valuesIngredients.setCondensedMilk(valuesIngredients.getCondensedMilk() - (20 * 3));
                    break;
                case 2:
                    valuesIngredients.setBanana(valuesIngredients.getBanana() - (50 * 3));
                    valuesIngredients.setIce(valuesIngredients.getIce() - (30 * 3));
                    valuesIngredients.setCondensedMilk(valuesIngredients.getCondensedMilk() - (20 * 3));
                    break;
                case 3:
                    valuesIngredients.setMango(valuesIngredients.getMango() - (50 * 3));
                    valuesIngredients.setIce(valuesIngredients.getIce() - (30 * 3));
                    valuesIngredients.setCondensedMilk(valuesIngredients.getCondensedMilk() - (20 * 3));
                    break;

            }
            System.out.println("\nMaking......");
            Thread.sleep(5*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
    }
    
}
