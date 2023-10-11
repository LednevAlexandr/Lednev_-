
import java.util.ArrayList;
import java.util.List;

public class AvtomatHotdrink {
    List<Coffe> list = new ArrayList();

    public List<Coffe> getHotdrinkName() {

        return list;
    }

    public void initHotdrinkName(List<Coffe> list) {

        this.list = list;
    }

    @Override
    public String toString() {
        return "AvtomatHotdrink{" +
                "list=" + list +
                '}';
    }
}

