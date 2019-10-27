package units;

public class Warrior extends BattleUnit {
    public Warrior(String name, int speed, int health, int attackScore) {
        super(name, speed, health, attackScore);
    }


    @Override
    public void attack(Unit enemy) {
        if (isAlive()) {
            System.out.println("Воин атаковал " + enemy.getName());
            enemy.setHealth(enemy.getHealth() - (attackScore + speed - enemy.speed));
        } else {
            System.out.println("Ты мертв, лежи спокойно");
        }
    }

    @Override
    public void rest() {
        System.out.println("Воин отдыхает как умеет. Восстановил " + (maxHealth + getSpeed()) / 10 + " здоровья");
        setHealth(getHealth() + (maxHealth + getSpeed()) / 10);
    }
}
