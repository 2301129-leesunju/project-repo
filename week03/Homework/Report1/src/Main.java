public class Main {
    public static void main(String[] args) {
        Student student = new Student("이순주",2301129,"코딩",20041110);
        StudentsList studentsList = new StudentsList();
        student.toStud();
        studentsList.birth(student.getBirthday());
    }
}