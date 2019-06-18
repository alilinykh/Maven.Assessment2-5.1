package rocks.zipcode.assessment2.collections;

import java.util.*;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
   HashMap<String ,Integer> map;

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        map = new HashMap<>();
        for (String s: strings
             ) {
            addItemToInventory(s);
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        map = new HashMap<>();
    }
    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        Integer num = map.get(item);
        if (num == null) {num = 0;}
        map.put(item, num + 1);
    }
    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        Integer num = map.get(item);
        if (num == null) {num = 0;}
        map.replace(item,num - 1);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        if (map.get(item) == null) {return 0;}
        else return map.get(item);
    }
}
