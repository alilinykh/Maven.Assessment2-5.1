package rocks.zipcode.assessment2.generics;


/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> {
    private Object element;
    private Shelter<T> shelter;

    public Shelter() {
        element = null;
    }



    /**
     * @return the number of item in the shelter
     */
    public int size() {

        return 1;
    }

    public void add(Object object) { this.element = object;
    }

    public Boolean contains(Object object) {


        return null;
    }

    public void remove(Object object) {

    }

    public Object get(Integer index) {

        return element;
    }

    public Integer getIndexOf(Object ageable) {
        return shelter.getIndexOf(ageable);
    }
}