package sorts;

import sorts.animationeStep.Rectangle;
import sorts.animationeStep.AnimationStep;

import java.util.LinkedList;

/**
 * Created by ria on 10/15/15.
 */
public abstract class Sort {

    protected Rectangle[] ref;
    protected Rectangle[] state;
    protected LinkedList<AnimationStep> animationSteps;

    Sort(Rectangle[] ref) {
        if (ref == null) {
            throw new IllegalArgumentException("Input array is null.");
        }
        this.animationSteps = new LinkedList<>();
        this.ref = ref;
        this.state = new Rectangle[ref.length];
        for (int i = 0; i < ref.length; i++) {
            state[i] = ref[i];
        }
        generateAnimation();
    }

    /**
     * Returns the list of animation steps
     * @return the List of AnimationSteps
     */
    public LinkedList<AnimationStep> getAnimationSteps() {
        return animationSteps;
    }

    /**
     * Generates the list of of animation steps for the array passed into the constructor.
     * Should only be called by the constructor.
     */
    protected abstract void generateAnimation();
}
