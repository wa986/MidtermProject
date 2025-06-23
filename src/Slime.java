public final class Slime extends Character{
    public Slime(String name, int hp){
        super(name,hp);
    }
    @Override
    public void attack(Character target) {
        System.out.println(name + "は体当たり攻撃！" + target.name + "に5のダメージを与えた！");
        target.hp -= 5;
    }
}