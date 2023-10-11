
import java.sql.SQLOutput;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       // Coffe Capuchino = new Coffe ("Cap",100,80);
       // Coffe Mocachino = new Coffe ("Moc",200,80);
       // Coffe espresso = new Coffe ("esp",50,70);
        //System.out.println(Snickers.name);
        AvtomatHotdrink AH = new AvtomatHotdrink();
        AH.initHotdrinkName(List.of(new Coffe("Cap",100,80),(new Coffe("Moc",200,80)),(new Coffe("esp",50,70))));
        System.out.println(AH.getHotdrinkName());


    }
}