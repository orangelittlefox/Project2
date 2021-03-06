package main.java;

import main.java.bouquet.Bouquet;
import main.java.flowers.Aloe;
import main.java.flowers.Aster;
import main.java.flowers.Herbera;
import main.java.flowers.Rosebud;

public class Main {
    public static void main(String[] args) {

        Bouquet bouquet = new Bouquet(4);
        Aloe aloe = new Aloe();
        Aster aster = new Aster();
        Rosebud rosebud = new Rosebud();
        Herbera herbera = new Herbera();

        bouquet.addFlower(aloe);
        bouquet.addFlower(aster);
        bouquet.addFlower(rosebud);
        bouquet.addFlower(herbera);

        Printer.print(bouquet.getFlowers());
        Printer.printPrice(bouquet.getBouquetCost());
    }
}
