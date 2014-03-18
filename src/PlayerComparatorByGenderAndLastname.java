import java.util.Comparator;

/**
 * Created by david on 3/16/14.
 */
public class PlayerComparatorByGenderAndLastname implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {

        int flag=0;
        int gender  = p1.getGender().compareToIgnoreCase(p2.getGender());
        int lname   = p1.getLastName().compareToIgnoreCase(p2.getLastName());
        if (gender==0)
            flag=lname;

        return flag;
    }
}
