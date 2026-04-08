import java.util.Objects;

public class Job {
    private People people;
    private String job;

    public Job(String job, People people) {
        this.job = job;
        this.people = people;
    }

    public void Jobtext(){
        if (Objects.equals(job, "선생님")){
            System.out.printf("\n%s %s 이(가) 수업을 합니다.",people.getName(),job);
            System.out.printf("\n%s %s 이(가) 과제를 채점합니다.",people.getName(),job);
        } else if (Objects.equals(job, "의사")) {
            System.out.printf("\n%s %s 이(가) 환자를 진료합니다.",people.getName(),job);
            System.out.printf("\n%s %s 이(가) 수술도 진행합니다.",people.getName(),job);
        }else if (Objects.equals(job, "엔지니어")) {
            System.out.printf("\n%s %s 이(가) 프로그램을 개발합니다.",people.getName(),job);
            System.out.printf("\n%s %s 이(가) 프로젝트의 버그를 수정합니다.",people.getName(),job);
        }else {
            System.err.println("잘못된 접근");
        }
    }
}
