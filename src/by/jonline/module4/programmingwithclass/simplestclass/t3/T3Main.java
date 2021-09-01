package module4.programmingwithclass.simplestclass.t3;

/*
3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class T3Main {

    public static Student[] students = {
            new Student("Гаврилов А. С.", 101, new int[]{8, 9, 7, 10, 9}),
            new Student("Ларин С. М.", 103, new int[]{9, 9, 8, 9, 10}),
            new Student("Фомичева Ю. И.", 102, new int[]{9, 9, 9, 10, 9}),
            new Student("Осипова А. Д.", 101, new int[]{7, 8, 9, 10, 9}),
            new Student("Севастьянова В. А.", 103, new int[]{9, 8, 7, 8, 9}),
            new Student("Кузьмина М. П.", 103, new int[]{9, 9, 10, 9, 10}),
            new Student("Смирнова А. А.", 101, new int[]{8, 9, 7, 9, 9}),
            new Student("Чернов М. Д.", 102, new int[]{9, 9, 9, 9, 9}),
            new Student("Ермакова Е. С.", 101, new int[]{8, 9, 8, 9, 8}),
            new Student("Хромов М. А.", 101, new int[]{8, 9, 9, 8, 9}),
    };

    public static void main(String[] args) {
        StudentLogic studentLogic = new StudentLogic();
        System.out.println("Список отличников:");
        studentLogic.printExcellentStudents(students);
    }

}
