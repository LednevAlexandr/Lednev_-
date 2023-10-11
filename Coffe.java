public class Coffe extends HotDrink{
    int temp;

    public int getTemp() {
        return temp;
    }

    public Coffe(String name, double volume, int temp) {
        super(name, volume,temp);
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Coffe{" +
                "temp=" + temp +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
