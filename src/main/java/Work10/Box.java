package Work10;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();


    public double getWeight(){
        double weight = 0.0;
        for(T o : box){
            weight += o.getWeight();
        }return weight;
    }
    public boolean compare(Box anotherBox) {
        if(getWeight() == anotherBox.getWeight()) return true;
        return false;
    }
    public void putTo (Box <T>anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
    }

    public void addFruit(T fruit, int sum){
        for(int i=0;i<sum;i++){
            box.add(fruit);
        }
    }

}