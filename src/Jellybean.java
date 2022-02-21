public class Jellybean extends Present{
    private final String name;
    private String color;

    public Jellybean(float price, float weight, String color) {
        super(price, weight);
        this.name = this.getClass().getName();
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return name + "{color= " + color + ", "+ super.toString() + "}";
    }
}
