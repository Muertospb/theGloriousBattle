package units;

public class King extends Unit {
    public King(String name, int speed, int health) {
        super(name, speed);
        setInitHealth(health);
    }

    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void rest() {
        System.out.println("Король отдыхает, что ему еще делать? Восстановил " + (maxHealth + getSpeed()) / 10 + " здоровья");
        setHealth(getHealth() + (maxHealth + getSpeed()) / 10);
    }
}
