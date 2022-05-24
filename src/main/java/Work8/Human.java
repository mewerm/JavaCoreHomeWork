package Work8;

public class Human implements Player {

    private final int distRun;
    private final int distJump;

    public Human(int distRun, int distJump) {
        this.distRun = distRun;
        this.distJump = distJump;


    }

    public int getDistRun() {
        return distRun;
    }

    public int getDistJump() {
        return distJump;
    }


    @Override
    public boolean jump(int wallHeight) {
        if (distJump <= wallHeight) {
            return true;
        } else if (distJump == 0) {
            return false;
        } else
            return false;
    }

    @Override
    public boolean run(int trackDist) {
        if (distJump <= trackDist) {
            return true;
        } else if (trackDist == 0) {
            return false;
        } else
            return false;
    }

    @Override
    public String toString() {
        return "Человек";
    }
}
