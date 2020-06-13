package main.java.bouquet;

import main.java.flowers.Flower;

public class Bouquet implements IBouquet {

    private Flower[] flowers;

    public Bouquet(int count) {
        flowers = new Flower[count];
    }

    public Flower[] getFlowers() {
        return this.flowers;

    }


    @Override
    public double getBouquetCost() {
        double result = 0.0;
        for (Flower flower : this.flowers) {
            if (flower != null)
                result += flower.getPrice();
            else
                break;
        }
        return result;
    }

    @Override
    public void addFlower(Flower flower) {
        if (Checker.getPosition(this.flowers) != -1) {
            int position = Checker.getPosition(this.flowers);
            this.flowers[position] = flower;
        } else {
            System.out.println("Error");
        }
    }
}
