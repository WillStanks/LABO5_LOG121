import java.util.ArrayList;

public class MouseMovement {
    private ArrayList<ActionCommands> listOfMouseMovementAction;

    public MouseMovement(){
        this.listOfMouseMovementAction = new ArrayList<>();
    }

    public void addAction(ActionCommands action) {
        listOfMouseMovementAction.add(action);
    }
}
