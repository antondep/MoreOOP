package lotr;
import java.util.Random;

import kickstrat.NobleStrategy;
public class Noble extends Character{
    private static final Random random = new Random();

    public Noble(int minHp, int maxHp, int minPower, int maxPower) {
        super(random.nextInt(maxPower - minPower) + minPower, random.nextInt(maxHp - minHp) + minHp, new NobleStrategy());
    }
    
}
