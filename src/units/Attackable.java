package units;

public interface Attackable {
    void attack(Unit enemy);

    default void escapeBattleField(){
        System.out.println("Юнит сбежал с поля боя");
    }
}
