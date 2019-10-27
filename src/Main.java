import units.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите тип персонажа");

        String userChoice = in.nextLine();
        BattleUnit battleUnit = null;
        if ("warrior".equals(userChoice)) {
            battleUnit = new Warrior("Воин", 3, 20, 15);
        } else if ("knight".equals(userChoice)) {
            battleUnit = new Knight("Рыцарь", 4, 22, 18);
        } else if ("doctor".equals(userChoice)) {
            battleUnit = new Doctor("Доктор", 2, 40, 5);
        }

        BattleUnit enemyChoice = new Knight("Рыцарь противника",
                4, 23, 17);
        System.out.println(enemyChoice.getHealth());

        battleUnit.attack(enemyChoice);
        System.out.println(enemyChoice.getHealth());
        enemyChoice.rest();
        System.out.println(enemyChoice.getHealth());


        // Инкапсуляция
        // Наследование
        // Абстракция
        // Полиморфизм

    }
}