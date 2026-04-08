public class People {
    protected String name;

    public People(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("3%s",name);
    }
}
