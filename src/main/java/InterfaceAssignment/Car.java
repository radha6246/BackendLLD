package InterfaceAssignment;

public class Car implements Comparable<Car>{
    private int Price;
    private int speed;
    public Car(int price, int speed) {
        this.Price = price;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    @Override
    public int compareTo(Car Other) {
        return this.Price-Other.Price;
    }
    // to Sort the objects based on price, we need to traverse through every object
    //one interface class , we can use
    //array is also an object


}
