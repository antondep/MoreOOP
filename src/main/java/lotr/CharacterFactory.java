package lotr;

import java.util.Random;
import java.util.ArrayList;
import org.reflections.Reflections;
import java.lang.reflect.Constructor;

public class CharacterFactory {
    private static final Random random = new Random();

    public lotr.Character createCharacter() {
        Reflections reflections = new Reflections("lotr");
        ArrayList<Class<? extends lotr.Character>> charClasses = new ArrayList<>(reflections.getSubTypesOf(
                lotr.Character.class));
        charClasses.removeIf(c -> c.equals(Noble.class));
        int idx = random.nextInt(charClasses.size());
        try {
            Constructor<? extends lotr.Character> constructor = charClasses.get(idx).getDeclaredConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}
