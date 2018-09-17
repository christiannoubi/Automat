import java.awt.Color;
import java.util.Date;

    public class SomeClass {

        public static void main(String[] args) {
            MyBot automat = new MyBot(14);
            Coffee coffee = new Coffee("Cafe au Lait", 2.5, new Date(), Color.BLACK, ProductCode.NESCAFE);
            Chocolate chocolate = new Chocolate("biscuit", 2.5, new Date(), 3, ProductCode.MAMBO);
            Coffee late = new Coffee("Latte", 2.5, new Date(), Color.BLACK, ProductCode.NESCAFE);
            Chocolate bueno = new Chocolate("Kinder Bueno", 2.5, new Date(), 3, ProductCode.MAMBO);

            // add products
            automat.addProduct(coffee);
            automat.addProduct(chocolate);
            automat.addProduct(late);
            automat.addProduct(bueno);

            // buy
            automat.kaufen(ProductCode.MAMBO);

            // einzahlen
            automat.einzahlen(1);
            automat.kaufen(ProductCode.MAMBO);

            automat.einzahlen(2);
            automat.kaufen(ProductCode.MAMBO);

            System.out.println("coffee's count: " + Coffee.count);

            System.out.println(coffee.getCategory());
        }
    }
