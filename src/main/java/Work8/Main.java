package Work8;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(20, 5);
        Human human = new Human(350, 1);
        Robot robot = new Robot(15, 2);
        Wall wall = new Wall(1);
        Track track = new Track(150);

        Player[] players = {cat, human, robot};
        Barrier[] barriers = {wall,track};

        for (Player player:players){
            for (Barrier barrier:barriers){
                if (!barrier.doWork(player)){
                    break;
                }

            }


        }
    }
}
