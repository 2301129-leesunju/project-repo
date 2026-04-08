public class Student {
    private String name;
    private int rollno;
    private String depart;
    private int birthday;

    public Student(String name, int rollno, String depart, int birthday) {
        this.name = name;
        this.rollno = rollno;
        this.depart = depart;
        this.birthday = birthday;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void toStud(){
        System.out.printf("이름 : %s , 학번 : %d , 학과 : %s , 생년월일 : %d , ",name,rollno,depart,birthday);
    }
}
