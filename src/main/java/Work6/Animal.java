package Work6;

public abstract class Animal {

    private String type;

    public static int COUNT_ANIMALS = 0;
    private String name;
    private int animalDistRun;
    private int animalDistSwim;


    Animal(String name, String type, int animalDistRun, int animalDistSwim) {
        this.type = type;
        this.name = name;
        this.animalDistRun = animalDistRun;
        this. animalDistSwim = animalDistSwim;
    }


    public abstract boolean run(int distance);

    public abstract boolean swim(int distance);
    public int getAnimalDistRun() {
        return animalDistRun;
    }

    public void setAnimalDistRun(int animalDistRun) {
        this.animalDistRun = animalDistRun;
    }

    public int getAnimalDistSwim() {
        return animalDistSwim;
    }

    public void setAnimalDistSwim(int animalDistSwim) {
        this.animalDistSwim = animalDistSwim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void printInfo(){
        System.out.println(this);
    }



    public String toString() {
        return String.format("Перед нами %s %s, попробует пробежать %d метров и, если не утонет, проплыть %d метров",getType(), getName(), getAnimalDistRun(), getAnimalDistSwim());
    }


}







