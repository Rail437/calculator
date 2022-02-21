public class Candy extends Present{
    private final String name;
    private String provider;

    public Candy(float price, float weight, String provider) {
        super(price, weight);
        this.name = this.getClass().getName();
        this.provider = provider;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return provider;
    }

    public void setBrand(String brand) {
        this.provider = brand;
    }

    @Override
    public String toString() {
        return name + "{provider= " + provider + ", "+ super.toString() + "}";
    }
}
