package sorts.animationeStep;

import javafx.scene.paint.Color;

/**
 * Created by ria on 10/16/15.
 */
public class Highlight extends AnimationStep {

    int[] indices;
    Color highlight;
    Color[] oldColor;

    public Highlight(Rectangle[] arr, int[] indices, Color highlight) {
        super(arr);
        this.indices = indices;
        this.highlight = highlight;
        oldColor = new Color[indices.length];
    }

    @Override
    public void execute() {
        for (int i : indices) {
            arr[i].setColor(highlight);
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]].setColor(oldColor[i]);
        }
    }
}
