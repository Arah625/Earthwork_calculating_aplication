public class Trapezium {

    private int topBase;
    private int bottomBase;
    private int height;
    private int length;


    public Trapezium(int topBase, int bottomBase, int height) {
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public void setTopBase(int topBase) {
        this.topBase = topBase;
    }

    public void setBottomBase(int bottomBase) {
        this.bottomBase = bottomBase;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTopBase() {
        return topBase;
    }

    public int getBottomBase() {
        return bottomBase;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int calculateArea() {
        int area = ((getTopBase() + getBottomBase()) * getHeight()) / 2;
        return area;
    }
}

