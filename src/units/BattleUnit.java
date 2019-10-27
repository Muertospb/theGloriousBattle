package units;

abstract public class BattleUnit extends Unit implements Attackable{

    protected int attackScore;

    public BattleUnit(String name, int speed, int health, int attackScore) {
        super(name, speed); // вызов конструктора родителя
        setInitHealth(health);
        setAttackScore(attackScore);
    }

    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
       if (attackScore > 0) {
           this.attackScore = attackScore;
       } else {
           this.attackScore = 1;
       }
    }



    @Override
    public String toString() {
        return "BattleUnit{" +
                "attackScore=" + attackScore +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void escapeBattleField() {
        System.out.println("Юнит " + getName() + " сбежал с поля боя");
    }
}