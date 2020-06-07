import Bouquet.Bouquet;
import Flowers.*;


public class Main {
    public static void main(String[] args) {

        Bouquet bouquet = new Bouquet();
        Aloe aloe = new Aloe("Green","Aloe",1.0);
        Aster aster = new Aster("Violet","Aster",2.0);
        Rosebud rosebud = new Rosebud("Red","Rosebud",3.0);
        Herbera herbera = new Herbera("White","Herbera",4.0);

        Flower[] flowers = {aloe, aster, rosebud, herbera};

        bouquet.setFlowersBouquet(flowers);

        System.out.println("Please choose flowers:" + "\n" +
                "1:Aloe" + "\n" +
                "2:Aster" + "\n" +
                "3:Rosebud" + "\n" +
                "4:Herbera" + "\n" +
                "input name of flower:");
        bouquet.totalPrice();
    }
}
