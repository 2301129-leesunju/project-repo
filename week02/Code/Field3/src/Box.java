public class Box {
    private int width;
    private int height;
    private int depth;
    private long color;
    private long message;

    public Box(int width, int height, int depth, long color, long message) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.message = message;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    public long getMessage() {
        return message;
    }

    public void setMessage(long message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("====박스====\n"+
                "\t가로:%d Cm\n"+
                "\t세로:%d Cm\n"+
                "\t높이:%d Cm\n"+
                "\t색깔:%s\n"+
                "\t메시지:%s",width,height,depth,color,message);
    }
}
