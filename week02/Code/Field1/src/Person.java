public class Person {
    //State 상태 - 명사
    private String name;
    private int age;
    private boolean gender; //true - 남 false - 여
    private boolean isMarried;
    private int child;
    //생성자

    public Person(String name, int age, boolean gender, boolean isMarried, int child) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        this.child = child;
    }
    //Method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    @Override
    public String toString() {
        String s = gender ? "남자" : "여자";

        return String.format("나이는 %d살, 이름은 %s이라는 %s가 있습니다." +
                "이 %s는 결혼을 %s 자식이 %d명 있습니다.",age,name,s,name,isMarried?"했고":"안했고",child);
    }
}