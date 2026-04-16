package cesde.repository;

import cesde.domain.Student;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentRepository {

    List<Student> students = new ArrayList<>();

    public Student createStudentRepository(Student student){

       // ArrayList<Student> studentData = new ArrayList<>();


        students.add(student);

        for (Student student1: students) {
            System.out.println(student1.getId() + " " + student1.getName() + " " + student1.getLastName());
        }

        /**for (ArrayList<Student> student1: students) {
            System.out.println(student1.get(0).getId() + " " + student1.get(0).getName() + " " + student1.get(0).getLastName());
        }**/

        return student;

    }


    public Student getStudentById(int id){


        return null;
    }

    public List<Student> getAllStudents(){


        return null;
    }



}
