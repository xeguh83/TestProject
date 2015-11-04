/**
 * Created by например Андрей on 04.11.2015.
 */
public class MultipleDependenceHandler {
    /**
     * Признак активности потоков
     */
    private static boolean working;

    /**
     * Установить не рабочее состояние
     */
    public static void setActiveFalse() {
        working = false;
    }

    private boolean isLock = true;

    public Object handle(ControllerItem event){

        working=true;

        // Вытаскиваются значения глобальных переменных
        while(working) {

            // Здесь происходит обработка данных и сеттинг результата в глобальные переменные

        }

        return "";
    }
}
