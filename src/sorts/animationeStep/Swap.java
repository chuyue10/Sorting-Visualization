package sorts.animationeStep;

/**
 * Created by ria on 10/15/15.
 *
 * When executed, this will swap element i and j in ref.
 *
 */
public class Swap extends AnimationStep {

    private int i;
    private int j;

    public Swap(Rectangle[] arr, int i, int j) {
        super(arr);
        this.i = i;
        this.j = j;
    }

    @Override
    public void execute() {
        super.execute();
        Rectangle temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Override
    public void undo() {
        super.undo();
        Rectangle temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("Swaps ");
        ret.append(arr[i].toString());
        ret.append(" at ");
        ret.append(i);
        ret.append(" and ");
        ret.append(arr[j].toString());
        ret.append(" at ");
        ret.append(j);
        ret.append(".");
        return ret.toString();
    }
}
