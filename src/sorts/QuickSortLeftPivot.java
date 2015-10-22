package sorts;

import sorts.animationeStep.Rectangle;
import sorts.animationeStep.Swap;

/**
 * Created by ria on 10/17/15.
 */
public class QuickSortLeftPivot extends Sort {

    public QuickSortLeftPivot(Rectangle[] ref) {
        super(ref);
    }

    @Override
    protected void generateAnimation() {
        quickSort(new int[] {0, ref.length - 1});
    }

    public void quickSort(int[] section) {
        if (section[1] > section[0]) {
            int pivotIndex = partition(section);
            quickSort(new int[] {section[0], pivotIndex});
            quickSort(new int[] {pivotIndex + 1, section[1]});
        }
    }

    public int partition(int[] section) {
        Rectangle pivot = state[section[0]];
        int high = section[1] + 1;
        int low = section[0] - 1;
        while (true) {
            do {
                high--;
            } while (state[high].compareTo(pivot) > 0);
            do {
                low++;
            } while (state[low].compareTo(pivot) < 0);
            if (low < high) {
                (new Swap(state, low, high)).execute();
                animationSteps.add(new Swap(ref, low, high));
            } else {
                return high;
            }
        }
    }
}
