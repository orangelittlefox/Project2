import Bouquet.Bouquet;
import Flowers.Aloe;
import Flowers.Aster;
import Flowers.Herbera;
import Flowers.Rosebud;

public class Main {
    public static void main(String[] args) {

        Bouquet bouquet = new Bouquet();
        Aloe aloe = new Aloe();
        Aster aster = new Aster();
        Rosebud rosebud = new Rosebud();
        Herbera herbera = new Herbera();

        System.out.println("Please choose flowers:" + "\n" +
                "1:Aloe" + "\n" +
                "2:Aster" + "\n" +
                "3:Rosebud" + "\n" +
                "4:Herbera" + "\n" +
                "input name of flower:");
        bouquet.totalPrice();
    }
}
