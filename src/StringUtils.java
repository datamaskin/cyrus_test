import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by david on 3/13/14.
 */
public class StringUtils {

    private static StringUtils instance = null;

    public enum KEYS {LASTNAME, FIRSTNAME, GENDER, DOB, FAVCOLOR};

    protected void StringUtils() {
        // no instance
    }

    public static StringUtils getInstance() {
        if (instance==null) {
            instance = new StringUtils();
        }
        return instance;
    }

    public List<String> getStringAsList(String s) { // first clean up input, ugly but works
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        String delims = "[ ,|]+"; // space, comma, pipe
        String newline = "\n";
        int count = 0;
        List<String> lList = new ArrayList<String>(Arrays.asList(s.split(newline)));

        List<String> vList;

        ListIterator<String> it = lList.listIterator();
        String[] vStr = null;
        while (it.hasNext()) {
            int cnt = 0;
            vStr = it.next().split(delims);
            vList = new ArrayList<String>(Arrays.asList(vStr));

            int vSize = vList.size();
            Iterator<String> vit = vList.iterator();
            while (vit.hasNext() && vSize==6) {
                String tmp = vit.next();
                if (vList.get(cnt).equalsIgnoreCase(vStr[2])) {
                    vList.remove(vStr[2]);
                    vSize = vList.size();
                }

                cnt++;
            }

            if (vList.get(2).startsWith("F"))
                vList.set(2, "Female");
            else if (vList.get(2).startsWith("M"))
                vList.set(2, "Male");
            try {
                String dateStr = vList.get(3);
                Date date = sdf.parse(dateStr);
            } catch (ParseException e) { // not a date so just swap
                Collections.swap(vList, 3, 4);
            }

            lList.set(count, String.valueOf(vList));
            count++;
        }

        return lList;
    }

}
