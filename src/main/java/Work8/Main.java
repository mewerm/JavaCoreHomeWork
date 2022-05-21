package Work8;

public class Main {
    public static void main(String[] args) {

        Human human = new Human(400, 2);
        Cat cat = new Cat(15, 3);
        Robot robot = new Robot(2000, 10);

        Wall wall = new Wall(3);
        RunningTrack runningTrack = new RunningTrack(289);

//
//        cat.printInfo();
//        human.printInfo();
//        robot.printInfo();

//        System.out.println(cat);
        cat.jump();


        Participant[] participant = {human, cat, robot};
        Obstacle[] obstacles = {wall, runningTrack};

        for (Participant participants:participant) {


            for (Obstacle obstacless: obstacles){


            }

        }

    }




        /* 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
2.Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
3.Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.*/
}

