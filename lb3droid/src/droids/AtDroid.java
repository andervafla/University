package droids;

import java.util.Random;

/**
 * Клас,що представляє тип Attack дроїда
 */
public class AtDroid extends Droid{
    private final int chanceCrit;
    private final int critAttack;

    /**Конструктор без параметрів,що визиває конструктор у батьківського класу*/
    public AtDroid() {
        super("Attack Droid",75,15);
        critAttack=30;
        chanceCrit=20;
    }

    /**
     * Метод для атаки ворожого дроїда.Повертає урон нанесений дроїдом.
     * @return real damage or critAttack
     */
    @Override
    public int attack() {
        Random random = new Random();
        if (random.nextInt(100) > chanceCrit) return random.nextInt(damage-1)+1;
        else{
            System.out.println("Critical attack!");
            return critAttack;}
    }

}