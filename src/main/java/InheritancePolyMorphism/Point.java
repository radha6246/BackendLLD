package InheritancePolyMorphism;

public class Point {
    // write the code of point class here
    protected int x;
    protected int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void display(){
        System.out.println("["+x+","+y+"]");
    }
}

