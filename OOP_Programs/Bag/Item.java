package OOP_Programs.Bag;

public class Item {

    private static int count = 0;
    private static double totalWeight = 0;

    private String color;
    private double weight;
    
    
    public Item(String color, double weight) {
        this.color = color;
        this.weight = weight;
        increment(weight);
    }
    
    public Item(String color) {
        this.color = color;
        this.weight = 10;
        increment(10);
    }
    
    public Item(double weight) {
        this.color = "Red";
        this.weight = weight;
        increment(weight);
    }

    public Item() {
        this.color = "Red";
        this.weight = 10;
        increment(10);
    }
    
    private static void increment(double weight) {
        totalWeight += weight;
        count++;
    }

    public String toString() {
        return "Item [color=" + color + ", weight=" + weight + "]";
    }
    
    public static int getCount() {
        return count;
    }
    
    public static void setCount(int count) {
        Item.count = count;
    }
    
    public static double getTotalWeight() {
        return totalWeight;
    }
    
    public static void setTotalWeight(double totalWeight) {
        Item.totalWeight = totalWeight;
    }
    
    public double getWeight() {
        return weight;
    }
}
