package practice_6.photo_editor;

public class Main {
    static void main(String[] args) {

        PhotoEditor photoEditor = new PhotoEditor();

        photoEditor.doAction("Action1");
        photoEditor.doAction("Action2");
        photoEditor.printActions();

        photoEditor.doAction("Action3");
        photoEditor.doAction("Action4");
        photoEditor.printActions();

        photoEditor.undoAction();
        photoEditor.printActions();

        photoEditor.undoAction();
        photoEditor.printActions();

        photoEditor.undoAction();
        photoEditor.printActions();

        photoEditor.undoAction();
        photoEditor.printActions();
    }
}
