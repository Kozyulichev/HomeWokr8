public class Human implements runJump {
    private String name;
    private int maxHeight;
    private int maxLength;

    public Human(String name, int maxHeight, int maxLength) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println(name + " бежит");
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println(name + " прыгает");

    }

    @Override
    public String toString() {
        return "Человек с именем " + name;
    }

}


