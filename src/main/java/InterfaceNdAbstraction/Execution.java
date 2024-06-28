package InterfaceNdAbstraction;

public class Execution {

    public static void main(String[] args) {
       Car Maruti = new Car();
       MusicSystem Sony= new SonyMusicSytem();

      Maruti.setM(Sony);
      Maruti.playsong();
    }
}
