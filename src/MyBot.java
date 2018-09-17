public class MyBot {

    private Product[] products;
    private final int capacity;
    private int content;
    private double gutHaben;

    public MyBot(int capacity) {
        this.products = new Product[capacity];
        this.capacity = capacity;
        this.content = 0;
        this.gutHaben = 0;
    }

    public double getGutHaben() {
        return gutHaben;
    }

    public void setGutHaben(double gutHaben) {
        this.gutHaben = gutHaben;
    }

    public boolean isFull() {
        return this.content == this.capacity;
    }

    private int getNextFreeIndex() {
        for (int idx = 0; idx < this.products.length; idx++) {
            if (this.products[idx] == null) {
                return idx;
            }
        }
        return -1; //
    }

    public int getProductIndex(ProductCode code) {
        for (int idx = 0; idx < this.products.length; idx++) {
            if (this.products[idx] != null && this.products[idx].code == code) {
                return idx;
            }
        }
        return -1;
    }

    public void kaufen(ProductCode code) {
        int index = getProductIndex(code);
        if (index >= 0) {
            Product prod = this.products[index];
            if (prod.getPrice() <= this.gutHaben) {
                this.content--;
                this.gutHaben -= prod.getPrice();
                this.products[index] = null;
                System.out.println("gekauft: " + prod.toString());

                if (this.gutHaben > 0) {
                    System.out.println("Sie haben noch " + this.gutHaben + " EUR.");
                }
            } else {
                double restGeld = prod.getPrice() - this.gutHaben;
                System.out.println("Das Guthaben reicht nicht aus. Es fehlen " + restGeld + " EUR.");
            }
        } else {
            System.out.println("Das Produkt ist nicht vorhanden.");
        }
    }

    public void einzahlen(double betrag) {
        this.gutHaben += betrag;
    }

    public void addProduct(Product product) {
        if (!isFull()) {
            this.products[this.getNextFreeIndex()] = product;
            this.content++; // this.content = this.content + 1;
            System.out.println("Product hinzugefügt: " + product.getName());
        }
    }

    public void clear() {
        this.products = new Product[capacity];
        this.content = 0;
    }
}