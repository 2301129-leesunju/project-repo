
public class People {
    private String name;
    private int old;

    public People(String name, int old) {
        this.name = name;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }
    public void Hello(){
        System.out.printf("\n안녕하세요. 제 이름은 %s이고 %d살 입니다.",name,old);
    }
}
