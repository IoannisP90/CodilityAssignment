import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Class> classList = new ArrayList<>();
        classList.add(Car.class);
        classList.add(Plane.class);
        System.out.println(findClasses(classList));
    }

    static List<Class> findClasses(List<Class> classList) {
        List<Class> findClasses = new ArrayList<>();
        for (int i=0; i<classList.size(); i++) {
            if (classList.get(i).getSuperclass() == AbstractVehicle.class) {
                findClasses.add(classList.get(i));
            }
        }
        return findClasses;
    }

}
