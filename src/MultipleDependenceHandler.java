/**
 * Created by �������� ������ on 04.11.2015.
 */
public class MultipleDependenceHandler {
    /**
     * ������� ���������� �������
     */
    private static boolean working;

    /**
     * ���������� �� ������� ���������
     */
    public static void setActiveFalse() {
        working = false;
    }

    private boolean isLock = true;

    public Object handle(ControllerItem event){

        working=true;

        // ������������� �������� ���������� ����������
        while(working) {

            // ����� ���������� ��������� ������ � ������� ���������� � ���������� ����������

        }

        return "";
    }
}
