package sorts;

import sorts.animationeStep.AnimationStep;
import sorts.animationeStep.Rectangle;
import sorts.animationeStep.Swap;

/**
 * Created by ria on 10/15/15.
 */
public class BubbleSort extends Sort {

    public BubbleSort(Rectangle[] ref) {
        super(ref);
    }

    @Override
    protected void generateAnimation() {
        for (int i = 1; i < ref.length; i++) {
            for (int j = 1; j < ref.length + 1 - i; j++) {
                if (state[j].compareTo(state[j - 1]) < 0) {
                    animationSteps.add(new Swap(ref, j, j - 1));
                    (new Swap(state, j, j - 1)).execute();
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("Bubble sorts.Sort: \n");
        for (AnimationStep s : animationSteps) {
            ret.append(s.toString());
            ret.append("\n");
        }
        return ret.toString();
    }
}
