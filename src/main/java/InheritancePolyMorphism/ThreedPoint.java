package InheritancePolyMorphism;

public class ThreedPoint extends Point {
   private  int z;
    @Override
    public void display(){
        System.out.println("["+x+","+y+","+z+"]");
    }

    public void setZ(int z) {
        this.z = z;
    }
    public int getZ() {
        return z;
    }
}
