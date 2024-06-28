package InterfaceNdAbstraction;

public class Car {
    private String Model;
    private int year;
    private MusicSystem M;
    static void start() {
        System.out.println("Start the car");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public MusicSystem getM() {
        return M;
    }

    public void setM(MusicSystem m) {
        M = m;
    }
    public void playsong(){
        this.M.play();
    }

}
