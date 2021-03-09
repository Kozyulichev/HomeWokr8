import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        int wallHeight = random.nextInt(5);
        int tredMillLenght = random.nextInt(500);

        runJump[] participants = {
                new Cat("Черчиль", 3, 200),
                new Cat("Винишко", 2, 289),
                new Human("Иван Грозный", 1, 120),
                new Human("Станислав Федорович", 1, 100),
                new Robot("R2D2", 20, 1000),
                new Robot("Валли", 0, 500)
        };
        Obstaclable[] obstaclables = {
                new Wall(wallHeight),
                new TreadMill(tredMillLenght)
        };
        for (runJump participant : participants) {

            System.out.println("На дистанцию выходит " + participant);
            for (Obstaclable obstaclable : obstaclables) {
                System.out.println(participant + " проходит " + obstaclable);
                if (obstaclable.jump(participant.getMaxHeight()) ||
                        obstaclable.run(participant.getMaxLength())) {
                    System.out.println("И он справился, ура!");
                } else {
                    System.out.println("О нет, ну ничего в другой раз все получится");
                    break;
                }

            }
        }
    }
}
