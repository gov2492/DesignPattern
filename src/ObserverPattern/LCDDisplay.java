package ObserverPattern;

public class LCDDisplay implements IDisplay,Observer{

    WeatherStation weatherStation;
    public LCDDisplay(WeatherStation weatherStation) {
        this.weatherStation=weatherStation;
    }

    /**
     *
     */
    @Override
    public void display() {
        System.out.println("LCD Display Weather "+weatherStation.getTemp());
    }

    /**
     *
     */
    @Override
    public void update() {
        display();
    }
}
