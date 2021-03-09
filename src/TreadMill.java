public class TreadMill implements Obstaclable {
    int length;

    public TreadMill(int length) {
        this.length = length;
    }


    @Override
    public boolean run(int maxLength) {
        return (maxLength >= length);
    }

    @Override
    public boolean jump(int maxHeight) {
        return false;
    }

    @Override
    public String toString() {
        return "дорожку длинной " + length + " м";
    }
}
