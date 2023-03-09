
public class Bicycle extends Vehicle {

    protected int kmh;

    public Bicycle(String id, String name, int velocity, int kmh) {
        super(id, name, velocity);
        this.kmh = kmh;
    }

    public int getKmh() {
        return kmh;
    }

    public void setKmh(int kmh) {
        this.kmh = kmh;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int accelerate(int kmh) {
        return kmh;
    }

    private int i = velocity + kmh;

    @Override
    public String toString() {
        if (kmh+velocity <= 35) {
            return "Bicycle: " + '\n' +
                    " name =" + name + '\n' +
                    " id =" + name + '\n' +
                    " velocity =" + velocity + "km/h " + '\n' +
                    " acceleration = " + (kmh + velocity) + "km/h " + '\n' +
                    "Velocity accelerated by " + kmh + "km/h"
                    ;
        }
        return "Bicycle: " + '\n' +
                " name =" + name + '\n' +
                " id =" + name + '\n' +
                " velocity =" + velocity + "km/h " + '\n' +
                " acceleration = " + 0 + "km/h " + '\n' +
                "Maximum Speed reached. No acceleration possible.";
    }
    //throw new Exception("Maximum velocity reached. Acceleration not possible");

}
