package skylite;

/**
 * Created by Leila Yammine on 1/20/2016
 * Project Skylite
 * A model interface for the MVC system architecture
 */
public interface ModelInterface {
    void registerPowerObserver(PowerObserver newObserver);
    void removePowerObserver(int observerIndex);

    void turnLightOff();
    void turnLightOn();
}
