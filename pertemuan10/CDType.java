
import java.util.ArrayList; // imprt list
import java.util.List;

public class CDType {
    private List<Packing> items = new ArrayList<Packing>();
    // <Packing> adalah object
    // list itu mirip dengan array

    public void addItem(Packing packs) {
        this.items.add(packs);
        // biar ketauan agar tau darimana yaitu dari class itu sendiri
        // void pada method tidak akan menghasilkan namun akan memainkan logic
    }

    public void getCost() {
        for (Packing packs : items) {
            packs.price();
        }
    }

    public void showItems() {
        for (Packing packing : items) {
            System.out.print("CD name : " + packing.pack());
            System.out.println(", Price : " + packing.price());
        }
    }
}

// end of the CDType class