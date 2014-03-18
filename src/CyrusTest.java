import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by david on 3/16/14.
 */
public class CyrusTest {

    public static void main (String... aArguments) throws IOException {
        List<String> theBigBopper = new ArrayList<String>();
        List<String> l = new ArrayList<String>();

        for (String dataFolder : aArguments) {
            File testFile = new File(dataFolder);
            StringUtils stringUtils = new StringUtils();
            l = stringUtils.getStringAsList(ReadWriteTextFile.getContents(testFile));
            ListIterator<String> lit = l.listIterator();
            while(lit.hasNext()) {
                theBigBopper.add(lit.next());
            }
        }


        SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");

        Player[] players = new Player[theBigBopper.size()];
        int cnt = 0;
        for (String s: theBigBopper) {
            String[] _s = s.split(",");
            StringUtils.KEYS[] keys = StringUtils.KEYS.values();
            Player p = new Player("","","",new Date(),"");
            for (StringUtils.KEYS key: keys) {
                switch (key) {
                    case LASTNAME:
                        p.setLastName(_s[0].trim());
                        break;
                    case FIRSTNAME:
                        p.setFirstName(_s[1].trim());
                        break;
                    case GENDER:
                        p.setGender(_s[2].trim());
                        break;
                    case DOB:
                        try {
                            Date dob = null;
                            if (_s[3].contains("/"))
                                dob = sdf2.parse(_s[3].trim());
                            else if (_s[3].contains("-"))
                                dob = sdf1.parse(_s[3].trim());
                            sdf2.format(dob);
                            p.setDob(dob);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case FAVCOLOR:
                        p.setFavColor(_s[4].trim());
                        break;
                }
            }
            players[cnt] = p;
            cnt++;
        }
        Arrays.sort(players, new PlayerComparatorByGenderAndLastname());
        String outStr = cleanOutput(Arrays.toString(players));
        System.out.println("Output 1:\n" + outStr);
        Arrays.sort(players);
        outStr = cleanOutput(Arrays.toString(players));
        System.out.println("Output 2:\n" + outStr);
        Arrays.sort(players, new PlayComparatorByLastname());
        outStr = cleanOutput(Arrays.toString(players));
        System.out.println("Output 3:\n" + outStr);
    }

    private static String cleanOutput(String arryStr) {
        String outStr = arryStr.replace('[', ' ');
        outStr = outStr.replace(']', ' ');
        outStr = outStr.replace(',', ' ');
        return outStr;
    }
}
