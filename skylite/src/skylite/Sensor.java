package skylite;

import java.util.LinkedList;

/**
 * Created by Leila Yammine on 1/20/2016
 * Project Skylite
 * Controller implementation of the MVC system architecture
 */
public class Sensor implements ControllerInterface {

    private LinkedList<ModelInterface> lights;
    private UserInterfaceView view;
    //Some sort of sensor object for the TSL2561 goes here too

    public Sensor() {
        this.lights = new LinkedList<ModelInterface>();
        this.view = new UserInterfaceView();
        //INIT sensor object here
    }


    @Override
    public void adjustLightThreshold() {
        // Set new desired lux level
    }


    // Method here to constantly check sensor object's light levels
        /* when threshold crossed (rises above or falls below), issue turn on/off for all objects in "lights" list

         */

}
