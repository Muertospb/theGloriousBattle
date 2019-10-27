package units;

abstract public class Unit implements Restable {
    protected final static int maxHealth = 100;
    private static int playerCount = 0;
    protected String name;
    protected int health;
    protected int speed;

    public Unit(String name, int speed) {
        setName(name);
        setSpeed(speed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("") && !name.equals(null)) {
            this.name = name;
        } else {
            this.name = "DefaultPlayer" + ++playerCount;
        }

    }

    public int getHealth() {
        return health;
    }

    protected void setHealth(int health) {
        if (health > maxHealth){
            health = maxHealth;
            System.out.println("Достигнут максимальный уровень здоровья " + maxHealth);
        }
        this.health = health;
        if (getHealth() < 0) {
            System.out.println("Юнит " + getName() + " скоропостижно скончался");
        }

    }

    public void setInitHealth(int health) {
        if (0 <= health && health < maxHealth) {
            this.health = health;
        } else {
            this.health = maxHealth;
            System.out.println("Уровень здоровья установлен по умолчанию: " + maxHealth);
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            this.speed = 2;
            System.out.println("Скорость установлена по умолчанию: 2");
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void run() {
        if (isAlive()) {
            System.out.println("Юнит " + getName() + " перемещается со скоростью " + speed);
        } else {
            System.out.println(" Мертвый юнит " + getName() + " перемещается со скоростью 0");
        }
    }
}