package rocks.zipcode.assessment2.collections;

import java.util.*;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
   LinkedHashMap<String ,Integer> map = new LinkedHashMap<>();

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        for (String s: strings
             ) {
            map.put(s, 0);

        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        map.put("",0);
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        map.replace(item, map.get(item) + 1);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        map.replace(item,map.get(item)-1);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {

        return map.get(item);
    }
}
