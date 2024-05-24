package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{

    List<Observer> observers;

    int temp;

    public int getTemp() {
        return temp;
    }

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    /**
     * @param observer
     */
    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    /**
     * @param observer
     */
    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    /**
     *
     */
    @Override
    public void notifyTemp() {
       for (Observer observer:observers){
           observer.update();
       }
    }

}
