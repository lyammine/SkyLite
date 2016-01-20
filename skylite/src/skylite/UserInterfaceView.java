package skylite;

/**
 * Created by Leila Yammine on 1/20/2016
 * Project Skylite
 * View implementation of the MVC system architecture
 */
public class UserInterfaceView implements PowerObserver {

    private ControllerInterface sensor;


    public UserInterfaceView() {
        this.sensor = new Sensor();
    }

    @Override
    public void updateDraw() {

    }
}
