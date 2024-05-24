package ObserverPattern;

public class ObserverPatternMain {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        LCDDisplay lcdDisplay = new LCDDisplay(weatherStation);
        weatherStation.add(phoneDisplay);
        weatherStation.add(lcdDisplay);
        weatherStation.temp = 20;
        weatherStation.notifyTemp();


    }
}
