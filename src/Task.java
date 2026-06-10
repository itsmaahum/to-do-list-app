public class Task {
    private String description;
    private String category;

    public Task(String description, String category) {
        this.description = description;
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return description + " [" + category + "]";
    }
}