import java.util.Date;

public class Product {

    protected String name;
    protected double price;
    protected Date expirationDate;
    protected ProductEnum category;
    protected String description;
    protected ProductCode code;

    public Product(String name, double price,
                   Date expirationDate, ProductEnum category, ProductCode code) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.category = category;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public ProductEnum getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductCode getCode() {
        return code;
    }

    public void setCode(ProductCode code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
