import java.util.Objects;

public class PantryItem {
    private String name;
    private Category category = new Category("General");
    private Status status;

    public PantryItem(String name, Category category) {
        this.name = name;
        this.category = category;
        this.status = Status.IN_STOCK;
    }

    public enum Status {
        IN_STOCK,
        LOW_STOCK,
        OUT_OF_STOCK
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PantryItem that = (PantryItem) o;
        return name.equals(that.name) &&
                category.equals(that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }
}
