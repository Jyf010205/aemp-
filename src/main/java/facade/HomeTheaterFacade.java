package facade;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/26 11:10
 */
public class HomeTheaterFacade {
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dVDPlayer;

    public HomeTheaterFacade(){
        this.theaterLight = TheaterLight.GetInstance();
        this.popcorn = Popcorn.GetInstance();
        this.projector = Projector.GetInstance();
        this.screen = Screen.GetInstance();
        this.dVDPlayer = DVDPlayer.GetInstance();
    }

    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        dVDPlayer.on();
        theaterLight.dim();
    }

    public void play(){
        dVDPlayer.play();
    }

    public void end(){
        popcorn.off();
    }
}
