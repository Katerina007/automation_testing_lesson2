package  com.exadel;

import com.exadel.human.Teacher;
import java.util.Comparator;

public class TeachersComparator implements Comparator <Teacher> {
    @Override
    public int compare (Teacher t1, Teacher t2){
        return t1.getAge() - t2.getAge();
    }
}
