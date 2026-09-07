import java.util.ArrayList;

public class Items {
    private ArrayList<Item> items;

    public Items() {
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        this.items.add(item);
    }

    public void print() {
        for (Item item : this.items) {
            System.out.println(item.toString());
        }
    }
}