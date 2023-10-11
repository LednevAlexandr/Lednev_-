public class HotDrink {
    String name;
    double volume;

    public HotDrink(String name, double volume, int temp) {
        this.name = name;
        this.volume = volume;
    }

    public HotDrink(String name) {
        this.name = name;
    }

    public HotDrink(double volume) {
        this.volume = volume;
    }
    public HotDrink() {

    }
    public String getName() {
        return name;
    }


    public double getVolume() {
        return volume;
    }

}
