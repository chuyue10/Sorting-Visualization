package sorts.animationeStep;

/**
 * Created by ria on 10/17/15.
 *
 * When direction is true, arr[end] will be put at arr[start] and arr[i]
 * will but put at arr[i + 1] for i <= start < end.
 *
 * When direction is false, arr[start] will be put at arr[end] and arr[i]
 * will but put at arr[i -1] for i < start <= end.
 *
 */
public class Rotate extends AnimationStep {

    private int start;
    private int end;
    private boolean direction;

    public Rotate(Rectangle[] arr, int start, int end, boolean direction) {
        super(arr);
        if (start > end) {
            throw new IllegalArgumentException("Start index is greater than end index.");
        }
        this.start = start;
        this.end = end;
        this.direction = direction;
    }

    @Override
    public void execute() {
        super.execute();
        if (direction) {
            Rectangle temp = arr[end];
            for (int i = end - 1; i >= start; i--) {
                arr[i + 1] = arr[i];
            }
            arr[start] = temp;
        } else {
            Rectangle temp = arr[start];
            for (int i = start + 1; i <= end; i++) {
                arr[i - 1] = arr[i];
            }
            arr[end] = temp;
        }
    }

    @Override
    public void undo() {
        super.undo();
        if (!direction) {
            Rectangle temp = arr[end];
            for (int i = end - 1; i >= start; i--) {
                arr[i + 1] = arr[i];
            }
            arr[start] = temp;
        } else {
            Rectangle temp = arr[start];
            for (int i = start + 1; i <= end; i++) {
                arr[i - 1] = arr[i];
            }
            arr[end] = temp;
        }
    }
}
