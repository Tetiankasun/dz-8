package org.example;

import java.util.*;

public class GroupOfStudents {
    public Student elder;
    public List<Student> listOfStudents;
    public Map<String, List<Student>> listOfTasks;

    public GroupOfStudents(Student elder, List<Student> listOfStudents) {
        this.elder = elder;
        this.listOfStudents = listOfStudents;
        this.listOfTasks = new HashMap<>();

        if (elder == null) {
            throw new IllegalArgumentException();
        }
    }

    public void replaceTheStudent(Student replaceStudent) {
        for (Student st : listOfStudents) {
            if (st.getId() == replaceStudent.getId()) {
                st.setFirstName(replaceStudent.getFirstName());
                st.setLastName(replaceStudent.getLastName());
            }
        }
    }

    public void addTheTask(String task) {
        listOfTasks.put(task, new ArrayList<>());
    }

    public void changeTheElder(Student newElder) {
        elder = newElder;

    }

    public void addTheStudent(Student inputStudent) {
        listOfStudents.add(inputStudent);
    }

    public void removeTheStudent(Integer id) {
        listOfStudents.removeIf(s -> s.getId() == id);
    }
    public void markTheTaskAsDone(String task,Student goodStudent){
        List<Student> list = listOfTasks.get(task);
        if (list==null){
            throw new IllegalArgumentException();
        }
        list.add(goodStudent);
    }

}
