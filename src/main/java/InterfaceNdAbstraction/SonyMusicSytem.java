package InterfaceNdAbstraction;

import java.sql.SQLOutput;

public class SonyMusicSytem implements MusicSystem{
    @Override
    public void play() {
        System.out.println("Play a song");
    }

    @Override
    public void ChangeSong() {
        System.out.println("Change song");
    }

    @Override
    public void forwardSong() {
        System.out.println("Play next song");

    }
}
