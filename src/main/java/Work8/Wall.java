package Work8;

public class Wall implements Barrier {

    private final int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    public boolean doWork(Player players) {
        String name = players.toString();
        if (players.jump(wallHeight)) {
            System.out.println(name + " смог перепрыгнуть стену высотой " + wallHeight + " метров");
            return true;
        } else {
            System.out.println(name + " не смог перепрыгнуть стену высотой " + wallHeight + " метров");
            return false;
        }
    }
}
