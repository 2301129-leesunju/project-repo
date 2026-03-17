public class Person {
    private String name;
    private int height;
    private float weight;
    private Date birtday;

    @Override
    public String toString() {
        return String.format("이름:%s\n"+
                "신장:%d cm\n"+
                "몸무게:%f cm\n"+
                "나이:%s",name,height,weight,birtday);
    }
}
