package ObserverPattern;

public class PhoneDisplay implements Observer,IDisplay{

    WeatherStation weatherStation;
    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation=weatherStation;
    }

    /**
     *
     */
    @Override
    public void display() {
        System.out.println("Phone Display Weather "+weatherStation.getTemp());
    }

    /**
     *
     */
    @Override
    public void update() {
        display();
    }
}
