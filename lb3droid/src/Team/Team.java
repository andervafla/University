package Team;

import Printer.Printer;
import droids.AtDroid;
import droids.HlDroid;
import droids.DfDroid;
import droids.Droid;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**Клас для представлення команди дроїдів*/
public class Team {
    private final List<Droid> droids = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Конструктор з параметром
     * @param size кількість дроїдів у команді
     */
    public Team(int size)
    {
        fillTeam(size);
    }

    /**
     * Геттер для поля droids
     * @return droids
     */
    public List<Droid> getDroidList() {
        return droids;
    }

    /**
     * Метод для заповнення команди дроїдами
     * @param size кількість дроїдів у команді
     */
    public void fillTeam(int size)
    {
        for (int i = 0; i < size; i++) {
            Printer.print("Choose droid №" + (i + 1));
            try {
                droids.add(chooseDroid());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Метод для вибору дроїда
     * @return droid - екземпляр дроїда
     * @throws IOException виняток,що може виникнути при вводі
     */
    private Droid chooseDroid() throws IOException {
        Printer.print("1. Heal Droid\n2. Attack Droid\n3. Defend Droid\n4. Standart Droid");
        Droid droid;
        System.out.print("Your choice: ");
        String value = scanner.nextLine();

        while (!value.equals("1") && !value.equals("2")&& !value.equals("3")&& !value.equals("4")) {
            Printer.print("Invalid request");
            value = scanner.nextLine();
        }

        droid = switch (value) {
            case "1" -> new HlDroid();
            case "2" -> new AtDroid();
            case "3" -> new DfDroid();
            default -> new Droid("Default Droid",65,10);
        };

        Printer.printInputValue("Your choice: "+value);
        return droid;
    }
}