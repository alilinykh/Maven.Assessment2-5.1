package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String space = "";
        for (int i = 0; i < amountOfPadding -stringToBePadded.length() ; i++) {
            space += " ";
        }
        return space + stringToBePadded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String space = "";
        for (int i = 0; i < amountOfPadding -stringToBePadded.length() ; i++) {
            space += " ";
        }
        return stringToBePadded + space;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String result = "";
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            result +=stringToBeRepeated;
        }
        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        char [] arr = string.toCharArray();
        for (char c: arr
             ) {
            if(!Character.isAlphabetic(c) && !Character.isSpaceChar(c)) {return false;}
        }
        return true;

    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        char [] arr = string.toCharArray();
        for (char c: arr
             ) {
            if (!Character.isDigit(c)) {return false;}
        }
        return true;

//        return string.matches("-?\\d+(\\.\\d+)?");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        char [] arr = string.toCharArray();
        for (char c: arr
             ) {
            if (Character.isSpaceChar(c) || Character.isDigit(c) || Character.isLetter(c)) {return false;}
        }
        return true;
//        if (string.matches("[a-zA-Z0-9]+")) {return false;}
//        else return true;
    }
}
