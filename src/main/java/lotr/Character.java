package lotr;
import kickstrat.Kickstrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Character {
    private int power;
    private int hp;
    private Kickstrategy kickstrategy;

    public void kick(Character target){
        kickstrategy.kick(this, target);
    }

    public boolean isAlive() {
        return hp > 0;
    }
}
