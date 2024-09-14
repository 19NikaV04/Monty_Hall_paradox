// import java.util.ArrayList;
// import java.util.List;

/**
 * Класс для описания игрока
 */
public class Player {
    //имя игрока
    private final String name;
    //стратегия игрока, если true игрок меняет дверь
    private final boolean risk;

    public Player(String name, boolean risk) {
        this.name = name;
        this.risk = risk;
    }


    public String getName() {
        return name;
    }

    public boolean getRisk() {
        return risk;
    }
}
