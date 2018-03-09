package main.t05.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ekaterina Semenova on 09.03.2018.
 */
public class Group {

    private Discipline discipline;
    private Map<Student, Assessment> studentAssessmentMap = new HashMap<>();

    public Group(Discipline discipline){
        this.discipline = discipline;
    }


    public void addStudentAndAssessment(Student student, Object o) {
        switch (discipline) {
            case JAVA_COURSE: {
                if (!(o instanceof Integer)) {
                    //TODO exception
                    System.out.println("Assessment is incorrect");
                    break;
                }
                Assessment<Integer> a = new Assessment<>((Integer) o);
                studentAssessmentMap.put(student, a);
                break;
            }
            case MATH: {
                if (!(o instanceof Integer)) {
                    System.out.println("Assessment is incorrect");
                    break;
                }
                Assessment<Integer> a = new Assessment<>((Integer) o);
                studentAssessmentMap.put(student, a);
                break;
            }
            case CHEMISTRY: {
                if (!(o instanceof Double)) {
                    System.out.println("Assessment is incorrect");
                    break;
                }

                Assessment<Double> a = new Assessment<>((Double) o);
                studentAssessmentMap.put(student, a);
                break;
            }
            case ENGLISH: {
                if (!(o instanceof Double)) {
                    System.out.println("Assessment is incorrect");
                    break;
                }

                Assessment<Double> a = new Assessment<>((Double) o);
                studentAssessmentMap.put(student, a);
                break;
            }

            case PI: {
                if (!(o instanceof Double)) {
                    System.out.println("Assessment is incorrect");
                    break;
                }
                Assessment<Double> a = new Assessment<>((Double) o);
                studentAssessmentMap.put(student, a);
                break;
            }
        }
    }

    public boolean hasStudent(Student student){
        return studentAssessmentMap.containsKey(student);
    }

    public Object getAssessment(Student student) {
        if(this.hasStudent(student)){
            return studentAssessmentMap.get(student).getAssessment();
        }
        else {
            //TODO exception
            System.out.println("No such student");
            return 0;
        }
    }
public String getDiscipline(){
        return discipline.name();
}
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Discipline ").append(discipline.name()).append("\n");
        sb.append("List of students:\n");
        if(studentAssessmentMap.isEmpty()){
           sb.append("Nobody attends the class\n");
           return sb.toString();
        }
        for (Map.Entry<Student, Assessment> entry: studentAssessmentMap.entrySet()
             ) {
            sb.append(entry.getKey().getName()).append(" ");
            sb.append(entry.getKey().getSurname());
            sb.append(" Assessment is ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }



    public static class Assessment<A> {
        private A assessment;

        private Assessment(A assessment){
        this.assessment = assessment;
        }


        private A getAssessment() {
            return assessment;
        }
        @Override
        public String toString(){
            return assessment.toString();
        }
    }



}
