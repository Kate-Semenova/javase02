package main.t05.model;

/**
 * Created by Ekaterina Semenova on 09.03.2018.
 */
public class Student {
    private String name;
    private String surname;
    private int course;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        course = 1;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourse() {
        return course;
    }

    public String toString() {
        return name + " " + surname;
    }
    public boolean equals(Object object){
        if(object instanceof Student){
            Student newObject = (Student)object;
            if(!name.equals(newObject.getName())){
                return false;
            }
            if(!surname.equals(newObject.getSurname())){
                return false;
            }
            if(course == newObject.course){
                return true;
            }
        }
        return false;
    }
    public int hashCode(){
        return name.hashCode() * surname.hashCode() * course;
    }
}
