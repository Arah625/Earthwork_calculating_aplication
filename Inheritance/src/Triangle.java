public class Triangle extends Trapezium {

    public Triangle(int topBase, int bottomBase, int height) {
        super(topBase, 0, height);
    }


    @Override
    public void setTopBase(int topBase) {
        super.setTopBase(topBase);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
    }

    @Override
    public int getTopBase() {
        return super.getTopBase();
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public int getLength() {
        return super.getLength();
    }

    @Override
    public int calculateArea() {
        int area;
        return area = (getTopBase() * getHeight())/2;
    }



}


