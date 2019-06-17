package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Dog;
import rocks.zipcode.assessment2.generics.ageable.Person;

import java.util.ArrayList;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> {
    private T t;

    public Shelter() {

    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {

        return 1;
    }

    public void add(Object object) { t = (T)object;
    }

    public Boolean contains(Object object) {

        return null;
    }

    public void remove(Object object) {

    }

    public Object get(Integer index) {

        return t;
    }

    public Integer getIndexOf(Object ageable) {
        return null;
    }
}