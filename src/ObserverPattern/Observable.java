package ObserverPattern;

public interface Observable {

    void add(Observer observer);

    void remove(Observer observer);

    void notifyTemp();
}
