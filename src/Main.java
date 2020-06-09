import Bouquet.Bouquet;
import Flowers.*;


public class Main {
    public static void main(String[] args) {

        Bouquet bouquet = new Bouquet();
        Aloe aloe = new Aloe();
        Aster aster = new Aster();
        Rosebud rosebud = new Rosebud();
        Herbera herbera = new Herbera();

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
