public class Car extends Vehicle {

    protected int kmh;

    public Car(String id, String name, int velocity, int kmh) {
        super(id, name, velocity);
        this.kmh = kmh;
    }

    @Override
    public String toString() {
        return "Car: " + '\n' +
                " name = " + id + '\n' +
                " id = " + name + '\n' +
                " velocity = " + velocity + "km/h " + '\n' +
                " acceleration = " + (kmh+velocity) + "km/h "
                ;
    }

    @Override
    public int accelerate(int kmh) {
        return kmh;
    }
}
