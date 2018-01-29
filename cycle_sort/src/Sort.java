import java.util.ArrayList;
import java.lang.reflect.Mathod;

public class Sort {

    private static Sort instance = new Sort();
    public Port port;

    private Sort() {
        port = new Port();
    }

    public static Sort getInstance() {
        return instance;
    }

    public class Port implements ISort {

        private Method[] methods = getClass().getMethods();

        public String getSortingType() {
            return innerMethodGetSortingType();
        }

        public ArrayList<Integer> sort(ArrayList<Integer> forSort) {
            return innerMethodSort(forSort);
        }

        //listMethods
    }

    public String innerMethodGetSortingType() {
        return "CycleSort";
    }

    public ArrayList<Integer> innerMethodSort(ArrayList<Integer> forSort) {

    }

}