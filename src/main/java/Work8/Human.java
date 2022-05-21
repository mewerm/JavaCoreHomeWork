package Work8;

public class Human implements Participant {

    int distRun;
    int distJump;

    public Human(int distRun, int distJump) {
        this.distRun = distRun;
        this.distJump = distJump;
    }

    @Override
    public void run() {
        if (distRun <= MAX_HUMAN_RUN) {
            System.out.println("Человек бежит " + distRun + " метров");
        } else if (distRun > MAX_HUMAN_RUN && distRun <= 0) {
            System.out.println("Человеку не под силу эта дистанция");
        }

    }

    @Override
    public void jump() {
        if (distRun <= MAX_HUMAN_JUMP) {
            System.out.println("Человек прыгает " + distRun + " метров");
        } else if (distRun > MAX_HUMAN_JUMP && distRun <= 0) {
            System.out.println("Человеку не под силу эта дистанция");
        }
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Человек собирается пробежать " + distRun + " м. и прыгнуть на " + distJump + " м. через стену";
    }
}
