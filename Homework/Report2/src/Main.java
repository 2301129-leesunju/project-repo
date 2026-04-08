public class Main {
    public static void main(String[] args) {
        People people1 = new People("영희",24);
        People people2 = new People("철수",45);
        People people3 = new People("민수",35);
        Job job1 = new Job("선생님",people1);
        Job job2 = new Job("의사",people2);
        Job job3 = new Job("엔지니어",people3);
        Working working = new Working(people1, job1,people2,job2, people3,job3);
        working.JobWorking();

    }
}