import java.util.Comparator;

/**
 * Created by david on 3/16/14.
 */
public class PlayComparatorByLastname implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {

        return p2.getLastName().compareTo(p1.getLastName()); // sort by lastname descending, ascending not implemented
    }
}
