package Simple;

class Apple {


    private Variety variety;
    private double weight;

    public Apple(double weight, Variety variety) {
        this.weight = weight;
        this.variety = variety;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", variety=" + variety +
                '}';
    }

    public Variety getVariety() {
        return variety;
    }

    public void setVariety(Variety variety) {
        this.variety = variety;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
