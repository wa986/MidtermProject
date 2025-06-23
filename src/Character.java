public abstract class Character implements Creature {
    String name;
    int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public final boolean isAlive() {
        return hp > 0;
    }

    public void showStatus(){
        System.out.println(name + "：HP " + hp);
    }
}