package practice_6.photo_editor;

import java.util.Stack;

public class PhotoEditor {

    private Stack<String> actions;

    public PhotoEditor() {
        this.actions = new Stack<>();
    }

    public void doAction(String action) {
        actions.push(action);
    }

    public void undoAction() {
        actions.pop();
    }

    public void printActions() {
        System.out.println("ACTIONS: ");
        actions.forEach(System.out::println);
        System.out.println();
    }
}
