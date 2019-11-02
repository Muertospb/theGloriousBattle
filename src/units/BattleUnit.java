package units;

import java.util.Random;

abstract public class BattleUnit extends Unit implements Attackable {

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

/*В абстрактном классе BattleUnit создать статический метод, возвращающий объекты боевых юнитов, в зависимости от
переданного типа юнита ("warrior", "knight", "doctor"). Характеристики задавать рандомно, имя задавать следующим
образом: тип юнита + рандомное число.*/

    public static BattleUnit getUnit(String type, int speed, int health, int attackScore){
        Random random = new Random();
        BattleUnit unit = null;

        if (speed < 1 || 10 < speed ){
            speed = random.nextInt(10) + 1;
        }

        if (health < 10 || Unit.maxHealth < health){
            //Если переданное здоровье меньше 10 или больше максимального, то устанавливается рандом 10-100
            health = random.nextInt(Unit.maxHealth - 10) + 10;
        }

        if (attackScore < 1 || 20 < attackScore){
            attackScore = random.nextInt(20) + 1;
        }

        if (type.equals("warrior")){
            unit = new Warrior("Warrior" + random.nextInt(99999), speed, health, attackScore);
        }
        if (type.equals("knight")){
            unit = new Knight("Knight" + random.nextInt(99999), speed, health, attackScore);
        }
        if (type.equals("doctor")){
            unit = new Doctor("Doctor" + random.nextInt(99999), speed, health, attackScore);
        }

        return unit;
    }

//Перегруженный метод для генерации объекта только по типу
    public static BattleUnit getUnit(String type){
       return getUnit(type, 0, 0, 0);
    }

}