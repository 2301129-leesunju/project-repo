public class FastFood {
    private int radius;
    private String name;
    final private float pie;
    public FastFood(){
        this.pie= 3.14F;
    }

    public FastFood(float pie, String name, int radius) {
        this.pie = pie;
        this.name = name;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPie() {
        return pie;
    }
    public float area(){
        return pie * radius *radius;
    }

    public String toString() {
        float s = area();
        String d = Float.toString(s);
        return String.format("%s는 반지름이 %d cm 이고,%s",name,radius,s);

    }
}
