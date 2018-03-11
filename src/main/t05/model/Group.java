package main.t05.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ekaterina Semenova on 09.03.2018.
 */
public class Group {

    private Discipline discipline;
    private Map<Student, Mark> studentMarkMap = new HashMap<>();

    public Group(Discipline discipline) {
        this.discipline = discipline;
    }


    public void addStudentAndMark(Student student, Object o) {
        switch (discipline) {
            case JAVA_COURSE: {
                if (!(o instanceof Integer)) {
                    //TODO exception
                    System.out.println("Mark is incorrect");
                    break;
                }
                Mark<Integer> a = new Mark<>((Integer) o);
                studentMarkMap.put(student, a);
                break;
            }
            case MATH: {
                if (!(o instanceof Integer)) {
                    System.out.println("Mark is incorrect");
                    break;
                }
                Mark<Integer> a = new Mark<>((Integer) o);
                studentMarkMap.put(student, a);
                break;
            }
            case CHEMISTRY: {
                if (!(o instanceof Double)) {
                    System.out.println("Mark is incorrect");
                    break;
                }

                Mark<Double> a = new Mark<>((Double) o);
                studentMarkMap.put(student, a);
                break;
            }
            case ENGLISH: {
                if (!(o instanceof Double)) {
                    System.out.println("Mark is incorrect");
                    break;
                }

                Mark<Double> a = new Mark<>((Double) o);
                studentMarkMap.put(student, a);
                break;
            }

            case PI: {
                if (!(o instanceof Double)) {
                    System.out.println("Mark is incorrect");
                    break;
                }
                Mark<Double> a = new Mark<>((Double) o);
                studentMarkMap.put(student, a);
                break;
            }
        }
    }

    public boolean hasStudent(Student student) {
        return studentMarkMap.containsKey(student);
    }

    public Object getMark(Student student) {
        if (this.hasStudent(student)) {
            return studentMarkMap.get(student).getMark();
        } else {
            //TODO exception
            System.out.println("No such student");
            return 0;
        }
    }

    public String getDiscipline() {
        return discipline.name();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Discipline ").append(discipline.name()).append("\n");
        sb.append("List of STUDENTS:\n");
        if (studentMarkMap.isEmpty()) {
            sb.append("Nobody attends the class\n");
            return sb.toString();
        }
        for (Map.Entry<Student, Mark> entry : studentMarkMap.entrySet()
                ) {
            sb.append(entry.getKey().getName()).append(" ");
            sb.append(entry.getKey().getSurname());
            sb.append(" Mark is ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }


    public static class Mark <A extends Number> {
        private A mark;

        public Mark(A mark) {
            this.mark = mark;
        }


        public A getMark() {
            return mark;
        }

        @Override
        public String toString() {
            return mark.toString();
        }
    }


}
