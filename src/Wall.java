public class Wall implements Obstaclable {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean run(int maxLength) {
        return false;
    }

    @Override
    public boolean jump(int maxHeight) {
        return (maxHeight >= height);
    }

    @Override
    public String toString() {
        return "Стенку высотой " + height + " м";
    }
}
