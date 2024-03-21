import java.util.ArrayList;

public class ToolBar {
    private ArrayList<ActionCommands> listOfToolBarAction;

    public ToolBar(){
        this.listOfToolBarAction = new ArrayList<>();
    }

    private void addAction(ActionCommands action) {
        listOfToolBarAction.add(action);
    }
}
