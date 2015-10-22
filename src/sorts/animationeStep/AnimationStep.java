package sorts.animationeStep;

/**
 * Created by ria on 10/15/15.
 */
public abstract class AnimationStep {

    protected Rectangle[] arr;
    protected boolean executed;

    AnimationStep(Rectangle[] arr) {
        this.arr = arr;
        this.executed = false;
    }

    /**
     * Executes the step.
     */
    public void execute() {
        if (!executed) {
            executed = true;
        } else {
            throw new IllegalStateException("Cannot execute. This step has already been executed.");
        }
    }

    /**
     * Undos the step. The default does nothing.
     */
    public void undo() {
        if (executed) {
            executed = false;
        } else {
            throw new IllegalStateException("Cannot undo. This step has not yet been executed.");
        }
    }
}
