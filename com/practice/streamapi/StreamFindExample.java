package com.practice.streamapi;

import java.util.List;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class StreamFindExample {
    public static void main(String[] args) {
        List<Student>students=List.of(
                new Student(1, "Ani"),
                new Student(2, "Bini"),
                new Student(3, "Rukku"),
                new Student(4, "Nitya")
        );
        Student firstResult=students.stream()
                                    .filter(s->"Ani".equals(s.getName()))
                                    .findAny()// terminal operation
                                    .orElse(null);
        System.out.println(firstResult);

    }
}
//before Streampublic static Student getStudentByName(List<Student> students, String name) {

   // for (Student s : students) {
    //    if (name.equals(s.getName())) {
    //        return s;
      //  }
   // }
   // return null;
//}

