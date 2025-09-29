package kickstrat;

import lotr.Character;

public class HobbitStrategy implements Kickstrategy {
    @Override
    public void kick(Character c, Character target) {
        System.out.println("cry emodji");
    }
}