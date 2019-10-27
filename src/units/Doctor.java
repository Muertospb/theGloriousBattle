package units;

public class Doctor extends BattleUnit {
    public Doctor(String name, int speed, int health, int attackScore) {
        super(name, speed, health, attackScore);
    }

    @Override
    public void attack(Unit friend) {
        if (isAlive()) {
            if (friend.isAlive()) {
                System.out.println("Доктор увеличил очки здоровья " + friend.getName() + " на " + attackScore);
                friend.setHealth(friend.getHealth() + attackScore);
            } else {
                System.out.println("Оживлять мертвых будем на другом уроке");
            }
        } else {
            System.out.println("Мертвые не воюют. Пока что.");
        }
    }

    @Override
    public void rest() {
        System.out.println("Доктор скушал что-то из аптечки и отдыхает. Восстановил " + (maxHealth + getAttackScore() + getSpeed()) / 10+ " здоровья. Себе!");
        setHealth(getHealth() + (maxHealth + getSpeed()) / 10);
    }
}