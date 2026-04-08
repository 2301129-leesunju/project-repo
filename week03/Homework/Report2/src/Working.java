public class Working {
    private People people1;
    private Job job1;
    private People people2;
    private Job job2;
    private People people3;
    private Job job3;

    public Working(People people1, Job job1, People people2, Job job2, People people3, Job job3) {
        this.people1 = people1;
        this.job1 = job1;
        this.people2 = people2;
        this.job2 = job2;
        this.people3 = people3;
        this.job3 = job3;
    }

    public void JobWorking(){
        people1.Hello();
        people2.Hello();
        people3.Hello();
        job1.Jobtext();
        job2.Jobtext();
        job3.Jobtext();
    }
}
