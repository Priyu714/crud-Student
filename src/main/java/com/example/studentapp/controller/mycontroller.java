package com.example.studentapp.controller;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class mycontroller {

    @GetMapping("StudentData")
    public List<Student> getAllDetails()
    {
        List<Student> list = new ArrayList<>();

        Student list1 = new Student(1,"Priyanka","ENTC");
        Student list2 = new Student(2,"Mikhi","IT");
        Student list3 = new Student(3,"Ankita","ENTC");
        Student list4 = new Student(4,"Priya","Computer");
        Student list5 = new Student(5,"Samarth","Electrical");

        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);

        return list;
    }

    @GetMapping("getStud/{id}")
    public Student getStudentbyId(@PathVariable int id)
    {
        List<Student> list = new ArrayList<>();

        Student list1 = new Student(1,"Priyanka","ENTC");
        Student list2 = new Student(2,"Mikhi","IT");
        Student list3 = new Student(3,"Ankita","ENTC");
        Student list4 = new Student(4,"Priya","Computer");
        Student list5 = new Student(5,"Samarth","Electrical");

        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);

        Student res =null ;
        for(Student s: list )
        {
            if(s.getId()==id)
            {
                res = s;
            }
        }
        return res;
    }

    @PostMapping("AddStud")
    public Student addNewStudent(@RequestBody Student student)
    {
        System.out.println( student);

        Student s = new Student();

        s.setId(student.getId());
        s.setName(student.getName());
        s.setBranch(student.getBranch());
        return s;
    }
    @PutMapping("updateStud/{id}")
     public List<Student> updateStudbyElement(@RequestBody Student student, @PathVariable int id){

        List<Student> list = new ArrayList<>();

        Student list1 = new Student(1,"Priyanka","ENTC");
        Student list2 = new Student(2,"Mikhi","IT");
        Student list3 = new Student(3,"Ankita","ENTC");
        Student list4 = new Student(4,"Priya","Computer");
        Student list5 = new Student(5,"Samarth","Electrical");

        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);

        for(Student s:list)
        {
            if(s.getId()==id)
            {
                s.setId(student.getId());
                s.setName(student.getName());
                s.setBranch(student.getBranch());
            }
        }
        return list;
     }

     @DeleteMapping("deleteStud/{id}")
     public List<Student> deletestudbyId(@PathVariable int id){

         List<Student> list = new ArrayList<>();

         Student list1 = new Student(1,"Priyanka","ENTC");
         Student list2 = new Student(2,"Mikhi","IT");
         Student list3 = new Student(3,"Ankita","ENTC");
         Student list4 = new Student(4,"Priya","Computer");
         Student list5 = new Student(5,"Samarth","Electrical");

         list.add(list1);
         list.add(list2);
         list.add(list3);
         list.add(list4);
         list.add(list5);

         List<Student> l = new ArrayList<>();

         for(Student s:list)
         {
             if(s.getId()==id)
             {

             }
             else{
                 l.add(s);
             }
         }
         return l;
     }
}
