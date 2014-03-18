import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by david on 3/16/14.
 */
public class Player implements Comparable<Player> {

    private String  lastName;
    private String  firstName;
    private String  gender;
    private Date    dob;
    private String  favColor;

    public Player() {

    }

    public Player(String lastName, String firstName, String gender, Date dob, String favColor) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.dob = dob;
        this.favColor = favColor;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getFavColor() {
        return favColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    @Override
    public int compareTo(Player p) { // default sorting
        // ascending
        Date compareDOB = p.getDob();

        return this.dob.compareTo(compareDOB);

    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String dteStr = sdf.format(this.dob);
        return this.lastName.replace('[', ' ') + " " + this.firstName + " " + this.gender + " " + dteStr + " " + this.favColor.replace(']', ' ') + "\n";
    }
}
