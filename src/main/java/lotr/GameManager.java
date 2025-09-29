package lotr;

public class GameManager {

    public void fight(Character c1, Character c2) {

        System.out.println("Fight: " + describe(c1) + " vs " + describe(c2));
        int round = 1;
        final int MAX_ROUNDS = 100;

        while (c1.isAlive() && c2.isAlive() && round <= MAX_ROUNDS) {

            System.out.println(describe(c1) + " attacks " + describe(c2));
            c1.kick(c2);
            System.out.println("After attack: " + describe(c2));
            if (!c2.isAlive()) {
                System.out.println(describe(c2) + " is dead. Winner: " + describe(c1));
                return;
            }

            System.out.println(describe(c2) + " attacks " + describe(c1));
            c2.kick(c1);
            System.out.println("After attack: " + describe(c1));
            if (!c1.isAlive()) {
                System.out.println(describe(c1) + " is dead. Winner: " + describe(c2));
                return;
            }

            round++;
        }

        if (round > MAX_ROUNDS) {
            System.out.println("Draw");
        }
    }

    private String describe(Character c) {
        return c.getClass().getSimpleName() + "(HP=" + c.getHp() + ", Power=" + c.getPower() + ")";
    }
}
