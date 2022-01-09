package encapsulation;

public class Product {
    private String name;
    private double cost;
    protected int barcode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        } else {
            System.out.println("Cost cannot be negative");
        }
    }

    protected Product(String name, double cost) {
        setName(name);
        setCost(cost);
        setBarcode();
    }
    private void setBarcode(){
        barcode = 123;
    }
}
