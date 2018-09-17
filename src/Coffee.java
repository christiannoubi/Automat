import java.awt.Color;
import java.util.Date;

public class Coffee extends Product {

    private Color color;
    public static int count;

    public Coffee(String name, double price, Date expirationDate, Color color, ProductCode code) {
        super(name, price, expirationDate, ProductEnum.DRINK, code);
        this.color = color;
        count++;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}