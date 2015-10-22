package sorts;

import sorts.animationeStep.Rectangle;
import sorts.animationeStep.Swap;

import java.util.Random;

/**
 * Created by ria on 10/15/15.
 */
public class SortUtils {

    public static Rectangle[] getSortedRectangleArray(int length) {
        Rectangle[] arr = new Rectangle[length];
        for (int i = 0; i < length; i++) {
            arr[i] = new Rectangle(i + 1);
        }
        return arr;
    }

    public static Rectangle[] getReverseSortedRectangleArray(int length) {
        Rectangle[] arr = new Rectangle[length];
        for (int i = 0; i < length; i++) {
            arr[i] = new Rectangle(length - i);
        }
        return arr;
    }

    public static Rectangle[] getRandomRectangleArray(int length) {
        return shuffle(getSortedRectangleArray(length));
    }

    public static Rectangle[] shuffle(Rectangle[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            (new Swap(arr, i, random.nextInt(arr.length))).execute();
        }
        return arr;
    }

    public static void printArray(Rectangle[] arr) {
        StringBuilder ret = new StringBuilder();
        ret.append("[");
        for (int i = 0; i < arr.length; i++) {
            ret.append(arr[i].getValue());
            if (i < arr.length - 1) {
                ret.append(" ");
            }
        }
        ret.append("]");
        System.out.println(ret);
    }
}
