package studentinfo.student;

import java.util.List;

public interface StudentLogic {
    Student save(Student student);
    List<Student> findAll();
    Student findById(long id);
}