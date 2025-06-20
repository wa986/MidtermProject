public abstract class Character implements Creature {
    String name;
    int hp;
    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    protected Character() {
    }

    public abstract void attack(Character target);

    final boolean isAlive() {
        return hp > 0;
    }

    void showStatus(){
        System.out.println("「[" + this.name + "：HP [" + this.hp + "]」");
    }
}