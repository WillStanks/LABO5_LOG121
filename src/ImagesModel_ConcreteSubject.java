import java.util.ArrayList;

public abstract class ImagesModel_ConcreteSubject implements Images_Model{
    private ArrayList<Observer> observers;
    private float positionX;
    private float positionY;
    private int zoom;

    public ImagesModel_ConcreteSubject() { observers = new ArrayList<Observer>(); }

    public float getPositionX() { return this.positionX; }
    public float getPositionY() { return this.positionY; }
    public int getZoom() { return this.zoom; }

    public void setPositions(float positionX, float positionY, int zoom) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.zoom = zoom;

        // A chaque fois que les mesures sont changer, alors tous les observeurs sont notifiés
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public abstract void notifyObservers();

}
