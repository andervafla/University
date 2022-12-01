package droids;

import java.util.Random;
/**
 * Клас,що представляє тип Heal дроїда
 */
public class HlDroid extends Droid{
    private final int chanceToHeal;
    private final int healHp;

    /**Конструктор без параметрів,що визиває конструктор у батьківського класу*/
    public HlDroid(){
        super("Heal Droid",100,15);
        this.chanceToHeal = 25;
        this.healHp = 15;
    }
    /**
     * Метод для отримання урону дроїдом
     * @param damage урон,що наніс ворожий дроїд
     * @return false or true
     */
    @Override
    public boolean getHit(int damage) {
        Random random = new Random();
        this.health -= damage;
        if(random.nextInt(100) < chanceToHeal) {
            this.health += healHp;
            System.out.println("The heal droid recovered "+healHp+" HP");
        }
        if (health<0) {
            health = 0;
            System.out.println("The "+name+" droid was killed!");
        }
        return true;
    }

}