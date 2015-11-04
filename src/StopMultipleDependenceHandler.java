/**
 * Created by например Андрей on 04.11.2015.
 */
public class StopMultipleDependenceHandler {
    public Object handle(ControllerItem event) {
        MultipleDependenceHandler.setActiveFalse();
        return "";
    }
}
