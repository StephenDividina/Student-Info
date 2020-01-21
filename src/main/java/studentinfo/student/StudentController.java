package studentinfo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentLogic task;

    @PostMapping("/save")
    public Student student(@RequestBody Student student) throws Exception{
        return task.save(student);
    }

    @PostMapping("/findAll")
    public List<Student> findAll(){
        return task.findAll();
    }

    @PostMapping("/findById")
    public Student findById(@RequestBody long id){
        return task.findById(id);
    }

}
