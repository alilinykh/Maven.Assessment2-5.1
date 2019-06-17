package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
    private HashMap<Integer,String> map = new HashMap<>();
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        map.put(monthNumber,monthName);
    }
    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {

        if(map.containsKey(monthNumber)) {return map.get(monthNumber);}
        else return null;
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        Integer key = 0;
        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            if (entry.getValue() == monthName) {
                key = entry.getKey();
            }
        }
//        if (key == 0) { key = null; }
        return key;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        if (map.containsKey(monthNumber)) {return true;}
        else return false;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        if (map.containsValue(monthName)) {return true;}
        else return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return map.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        map.replace(monthNumber,monthName);

    }
}
