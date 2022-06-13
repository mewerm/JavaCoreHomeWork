package Work10;

public class TestFruit {
    public static void main(String[] args) {

        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();

        orangeBox.addFruit(new Orange(), 8);
        orangeBox1.addFruit(new Orange(), 37);
        appleBox.addFruit(new Apple(), 2);
        appleBox1.addFruit(new Apple(), 23);
        System.out.println("Вес коробок с фруктами: ");
        System.out.println("1 Коробка с апельсинами: " + orangeBox.getWeight());
        System.out.println("2 Коробка с апельсинами: " + orangeBox1.getWeight());
        System.out.println("1 Коробка с яблоками: " + appleBox.getWeight());
        System.out.println("2 Коробка с яблоками:: " + appleBox1.getWeight());
        System.out.println();

        System.out.println("Сравниваем вес коробок ");
        System.out.println(" Вес 1 Коробки с апельсинами == 1 Коробки с яблоками? :" + orangeBox.compare(appleBox));
        System.out.println("Вес Коробки с апельсинами == 2 Коробки с яблоками? :" + orangeBox1.compare(appleBox1));
        System.out.println();

        System.out.println("Перекладываем фрукты с 1 коробки во 2");
        orangeBox.putTo(orangeBox1);
        appleBox.putTo(appleBox1);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Вес коробок с фруктами после перекладывания: ");
        System.out.println("1 Коробка с апельсинами: " + orangeBox.getWeight());
        System.out.println("2 Коробка с апельсинами: " + orangeBox1.getWeight());
        System.out.println("1 Коробка с яблоками: " + appleBox.getWeight());
        System.out.println("2 Коробка с яблоками:: " + appleBox1.getWeight());

    }
}


