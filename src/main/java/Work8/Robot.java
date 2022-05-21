package Work8;

public class Robot implements Participant {

    int distRun;
    int distJump;

    public Robot(int distRun, int distJump) {
        this.distRun = distRun;
        this.distJump = distJump;
    }

    @Override
    public void run() {
        if (distRun <= MAX_ROBOT_RUN) {
            System.out.println("Робот бежит " + distRun + " метров");
        } else if (distRun > MAX_ROBOT_RUN && distRun <= 0) {
            System.out.println("Роботу не под силу эта дистанция");
        }

    }

    @Override
    public void jump() {
        if (distRun <= MAX_ROBOT_JUMP) {
            System.out.println("Робот прыгает " + distRun + " метров");
        } else if (distRun > MAX_ROBOT_JUMP && distRun <= 0) {
            System.out.println("Роботу не под силу эта дистанция");
        }
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Робот собирается пробежать " + distRun + " м. и прыгнуть на " + distJump + " м. через стену";
    }
}
