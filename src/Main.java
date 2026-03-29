interface camera{
    void takePhoto();
}
interface MusicPlayer{
    void playMusic();
}
class SmartPhone implements Camera,MusicPlayer{
    public void takePhoto(){
        System.out.println("photo taken");
    }
    @Override
    public void playMusic(){
        System.out.println("Music playing");
    }
}
public class Main{
    public static void main(String[] args){
        SmartPhone sp = new SmartPhone();
        sp.takePhoto();
        sp.playMusic();
    }
}