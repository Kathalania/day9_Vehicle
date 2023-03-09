public abstract class Vehicle implements Accelerable{
    protected String id;
    protected String name;
    protected int velocity;

    public Vehicle(String id, String name, int velocity) {
        this.id = id;
        this.name = name;
        this.velocity = velocity;
    }



}
