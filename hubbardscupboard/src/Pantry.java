import java.util.HashSet;

public class Pantry {
    private final String name = "MyPantry";
    private final HashSet<PantryItem> items = new HashSet<>();


    public void addItem(PantryItem item) {
        items.add(item);
    }

    public boolean removeItem(PantryItem item) {
        return items.remove(item);
    }

    public boolean hasItem(PantryItem item) {
        return items.contains(item);
    }

    public HashSet<PantryItem> getItems() {
        return items;
    }

}


