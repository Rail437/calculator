public class Chocolate extends Present{
    private final String name;
    private String brand;

    public Chocolate(float price, float weight, String brand) {
        super(price, weight);
        this.name = this.getClass().getName();
        this.brand = brand;
    }


    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return name + "{brand= " + brand + ", "+ super.toString() + "}";
    }
}
