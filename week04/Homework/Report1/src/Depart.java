public class Depart {
    private char depart;
    private String departmentName;

    public Depart(char depart, String departmentName) {
        this.depart = depart;
        this.departmentName = departmentName;
    }

    public char getDepart() {
        return depart;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString() {
        return String.format("%3s",departmentName);
    }
}
