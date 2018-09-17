package ru.onelya;

/**
 * Created by user6 on 17.09.2018.
 */
public class Utils {

    public static String intArrayToString(Integer[] integers) {
        String str = "";
        for(int i=0; i<integers.length; i++)
        {
            str = str + Integer.toString(integers[i]);
        }
        return str;
    }
}
