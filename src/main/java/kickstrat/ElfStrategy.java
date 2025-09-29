package kickstrat;

import lotr.Character;

public class ElfStrategy implements Kickstrategy {
    @Override
    public void kick(Character c, Character target) {
        if (c.getPower() > target.getPower()) {
            target.setHp(0);
        } else if (target.getPower() > 0) {
            target.setPower(target.getPower() - 1);
        } else {
            target.setHp(target.getHp() - 1);
        }
    }
}
