package Work8;

public class Cat implements Participant {

    int distRun;
    int distJump;


    public Cat(int distRun, int distJump) {
        this.distRun = distRun;
        this.distJump = distJump;
    }

    @Override
    public void run() {
        if (distRun <= MAX_CAT_RUN) {
            System.out.println("Кот бежит " + distRun + " метров");
        } else if (distRun > MAX_CAT_RUN && distRun <= 0) {
            System.out.println("Коту не под силу эта дистанция");
        }

    }

    @Override
    public void jump() {
        if (distRun <= MAX_CAT_JUMP) {
            System.out.println("Кот прыгает " + distRun + " метров");
        } else if (distRun > MAX_CAT_JUMP && distRun <= 0) {
            System.out.println("Коту не под силу эта дистанция");
        }
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Кот собирается пробежать " + distRun + " м. и прыгнуть на " + distJump + " м. через стену";
    }
}
