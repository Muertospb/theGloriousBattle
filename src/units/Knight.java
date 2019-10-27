package units;

public class Knight extends BattleUnit {
    public Knight(String name, int speed, int health, int attackScore) {
        super(name, speed, health, attackScore);
    }

    @Override
    public void attack(Unit enemy) {
        if (isAlive()) {
            System.out.println("Рыцарь атаковал " + enemy.getName());
            enemy.setHealth(enemy.getHealth() - (attackScore + speed - enemy.speed));
        } else {
            System.out.println("Мертвый рыцарь не имеет права атаковать (при всём желании)");
        }
    }

    @Override
    public void rest() {
        System.out.println("Рыцарь отдыхает вполне по рыцарски. Восстановил " + (maxHealth + getSpeed()) / 10 + " здоровья");
        setHealth(getHealth() + (maxHealth + getSpeed()) / 10);
    }
}