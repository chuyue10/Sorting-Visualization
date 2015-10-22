package sorts;

import sorts.animationeStep.AnimationStep;
import sorts.animationeStep.Rectangle;

/**
 * Created by ria on 10/15/15.
 */
public class Tester {

    public static void main(String[] args) {
        Rectangle[] rectangles = SortUtils.getRandomRectangleArray(21);
        SortUtils.printArray(rectangles);
        QuickSortRandomPivot qS = new QuickSortRandomPivot(rectangles);
        for (AnimationStep s : qS.getAnimationSteps()) {
            s.execute();
            SortUtils.printArray(rectangles);
        }
    }

}
