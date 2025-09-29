import lotr.CharacterFactory;
import lotr.Elf;
import lotr.GameManager;
import lotr.Hobbit;
import lotr.King;

public class Demo {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        GameManager gameManager = new GameManager();

        // Створюємо конкретних персонажів вручну
        Elf elf = new Elf();
        King king = new King();
        Hobbit hobbit = new Hobbit();

        System.out.println("Elf vs King");
        gameManager.fight(elf, king);

        System.out.println("\nHobbit vs Elf");
        gameManager.fight(hobbit, elf);

        System.out.println("\nRandom vs Random");
        lotr.Character rand1 = factory.createCharacter();
        lotr.Character rand2 = factory.createCharacter();

        if (rand1 != null && rand2 != null) {
            gameManager.fight(rand1, rand2);
        } else {
            System.out.println("Death of the system");
        }
    }
}