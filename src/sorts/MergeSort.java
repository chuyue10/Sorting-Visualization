package sorts;

import sorts.animationeStep.AnimationStep;
import sorts.animationeStep.Rectangle;
import sorts.animationeStep.Rotate;

/**
 * Created by ria on 10/17/15.
 */
public class MergeSort extends Sort {

    public MergeSort(Rectangle[] ref) {
        super(ref);
    }

    @Override
    protected void generateAnimation() {
        mergeSort(new int[] {0, ref.length - 1});
    }

    /**
     * Main merge method can be recursive
     * @param section the section to be sorted
     */
    private void mergeSort(int[] section) {
        if (section[1] > section[0]) {
            int mid = (section[0] + section[1]) / 2;

            int[] a = new int[] {section[0], mid};
            int[] b = new int[] {mid + 1, section[1]};

            mergeSort(a);
            mergeSort(b);

            merge(a, b);
        }
    }

    /**
     * Merges two sorted sections into a single sorted section
     * @param a the first section
     * @param b the second section
     */
    private void merge(int[] a, int[] b) {
        int aStart = a[0];
        int aEnd = a[1];
        int bStart = b[0];
        int bEnd = b[1];
        while (aStart <= aEnd && bStart <= bEnd) {
            if (state[bStart].compareTo(state[aStart]) < 0) {
                animationSteps.add(new Rotate(ref, aStart, bStart, true));
                (new Rotate(state, aStart, bStart, true)).execute();
                aStart++;
                aEnd++;
                bStart++;
            } else {
                aStart++;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("Merge sorts.Sort: \n");
        for (AnimationStep s : animationSteps) {
            ret.append(s.toString());
            ret.append("\n");
        }
        return ret.toString();
    }
}
