package module4.programmingwithclass.simplestclass.t3;

public class StudentLogic {

    public void printExcellentStudents(Student[] students) {
        boolean isExcellent;
        for (Student s : students) {
            isExcellent = true;
            for (int n : s.getGrade()) {
                if (n < 9) {
                    isExcellent = false;
                    break;
                }
            }
            if (isExcellent) {
                System.out.println(s.getName() + ", группа: " + s.getGroupNumber());
            }
        }
    }

}
