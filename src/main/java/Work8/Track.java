package Work8;

public class Track implements Barrier {

    private final int trackDist;

    public Track(int trackDist) {
        this.trackDist = trackDist;
    }

    @Override
    public boolean doWork(Player players) {
        String name = players.toString();
        if (players.run(trackDist)) {
            System.out.println(name + " смог пробежать дистанцию " + trackDist + " метров");
            return true;
        } else {
            System.out.println(name + " не смог пробежать дистанцию " + trackDist + " метров");
            return false;
        }
    }
}
