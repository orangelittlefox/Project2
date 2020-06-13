package main.java.bouquet;

import main.java.flowers.Flower;

public interface IBouquet {
    void addFlower(Flower flower);
    double getBouquetCost();
}
