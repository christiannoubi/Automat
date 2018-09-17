import java.util.Date;

public class Chocolate extends Product {

    private double weight;

     Chocolate(String name, double price, Date expirationDate, double weight, ProductCode code) {
        super(name, price, expirationDate, ProductEnum.SNACK, code);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}