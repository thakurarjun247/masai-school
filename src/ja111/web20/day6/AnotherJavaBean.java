package ja111.web20.day6;

public class AnotherJavaBean{
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public AnotherJavaBean(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public AnotherJavaBean(int x) {
        this.x = x;
    }

    public AnotherJavaBean() {
    }
}
