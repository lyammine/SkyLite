package skylite;

import java.util.LinkedList;

/**
 * Created by Leila Yammine on 1/20/2016
 * Project Skylite
 * Model implementation of MVC architecture
 */
public class Light implements ModelInterface {

    private LinkedList<PowerObserver> powerObservers;
    //Some sort of GPIO object for the actual light bulb goes here too

    public Light() {
        this.powerObservers = new LinkedList<PowerObserver>();
    }

    @Override
    public void registerPowerObserver(PowerObserver newObserver) {
        powerObservers.add(newObserver);
    }

    @Override
    public void removePowerObserver(int observerIndex) {
        powerObservers.remove(observerIndex);
    }

    @Override
    public void turnLightOff() {
        //use GPIO object here
    }

    @Override
    public void turnLightOn() {
        //use GPIO object here
    }


    // Periodically call updateDraw() for all entries in "powerObservers" list
}
