package Work8;

public class Robot implements Player {

    private final int distRun;
    private final int distJump;

    public Robot(int distRun, int distJump) {
        this.distRun = distRun;
        this.distJump = distJump;
    }

    @Override
    public boolean jump(int wallHeight) {
        if (distJump >= wallHeight) {
            return true;
        } else if (distJump == 0) {
            return false;
        } else
            return false;
    }

    @Override
    public boolean run(int trackDist) {
        if (distJump >= trackDist) {
            return true;
        } else if (trackDist == 0) {
            return false;
        } else
            return false;
    }

    @Override
    public String toString() {
        return "Робот";
    }
}
