package e3;

public class TextEditor {
    private Command saveCommand;

    public TextEditor(){
        saveCommand = new SaveCommand();
    }

    public void onPressSaveButton(){
        System.out.println("[Saved button]");
        saveCommand.execute();
    }

    public void onPressOption() {
        System.out.println("[Menu]");
        saveCommand.execute();
    }

    public void onShorOut() {
        System.out.println("[ShorOut]");
        saveCommand.execute();
    }
}
