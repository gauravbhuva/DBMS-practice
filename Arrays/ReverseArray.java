import java.util.*;

public class ReverseArray {
    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> arr = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) {
            arr.add(a.get(i));
        }
        return arr;
    }
}
