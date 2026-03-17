import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Member member = new Member();
        member.setName(member.readString("모델의 이름을 입력해주세요."));
        member.setModel(member.readString("모델의 제조사를 입력해주세요."));
        member.setType(member.readString("모델의 패널 종류를 입력해주세요."));
        member.setYear(member.readInt("모델의 제조년을 입력해주세요."));
        member.setInc(member.readInt("모델의 길이 ( 인치 ) 를 입력해주세요."));

        System.out.println(member);
    }
}