public abstract class Present {
    private float price;
    private float weight;

    public Present(float price, float weight) {
        this.price = price;
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  "price= " + price +
                ", weight= " + weight;
    }
}
