package by.epam.learn.University;

import by.epam.learn.UniversityExceptions.*;

import java.util.ArrayList;

public class UniversityManager {

    static final String DISCIPLINE_1 = "Architecture";
    static final String DISCIPLINE_2 = "Art";
    static final String DISCIPLINE_3 = "Chemistry";
    static final String DISCIPLINE_4 = "Biology";
    static final String DISCIPLINE_5 = "Mathematics";

    static final String FACULTY_1 = "Architecture and History of Art";
    static final String FACULTY_2 = "Biology";
    static final String FACULTY_3 = "Law";
    static final String FACULTY_4 = "Faculty of Music";
    static final String FACULTY_5 = "Physics & Chemistry";

    ArrayList<Student> students;
    ArrayList<Faculty> faculties;
    ArrayList<Group> groups;
    ArrayList<Discipline> disciplines;

    public UniversityManager(ArrayList<Student> students, ArrayList<Faculty> faculties,
                             ArrayList<Group> groups, ArrayList<Discipline> disciplines) {
        this.students = students;
        this.faculties = faculties;
        this.groups = groups;
        this.disciplines = disciplines;
    }

    public static void main(String[] args) throws InterruptedException, StudentAbsenceException,
            MarkValueException, FacultyAbsenceException, GroupAbsenceException, DisciplineAbsenceException {
        ArrayList<Discipline> disciplines = new ArrayList<>();
        disciplines.add(0, new Discipline(DISCIPLINE_1));
        disciplines.add(1, new Discipline(DISCIPLINE_2));
        disciplines.add(2, new Discipline(DISCIPLINE_3));
        disciplines.add(3, new Discipline(DISCIPLINE_4));
        disciplines.add(4, new Discipline(DISCIPLINE_5));

        ArrayList<Group> groups = new ArrayList<>();
        groups.add(0, new Group(1));
        groups.add(1, new Group(2));
        groups.add(2, new Group(3));

        ArrayList<Faculty> faculties = new ArrayList<>();
        faculties.add(0, new Faculty(FACULTY_1));
        faculties.add(1, new Faculty(FACULTY_2));
        faculties.add(2, new Faculty(FACULTY_3));
        faculties.add(3, new Faculty(FACULTY_4));
        faculties.add(4, new Faculty(FACULTY_5));

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Sidorov", faculties.get(0), groups.get(0), disciplines.get(0), 10));
        students.add(new Student(1, "Sidorov", faculties.get(0), groups.get(0), disciplines.get(1), 6));
        students.add(new Student(1, "Sidorov", faculties.get(0), groups.get(0), disciplines.get(2), 8));
        students.add(new Student(1, "Sidorov", faculties.get(0), groups.get(0), disciplines.get(3), 10));
        students.add(new Student(1, "Sidorov", faculties.get(0), groups.get(0), disciplines.get(4), 9));

        students.add(new Student(2, "Petrov", faculties.get(0), groups.get(2), disciplines.get(0), 8));
        students.add(new Student(2, "Petrov", faculties.get(0), groups.get(2), disciplines.get(1), 6));
        students.add(new Student(2, "Petrov", faculties.get(0), groups.get(2), disciplines.get(2), 10));
        students.add(new Student(2, "Petrov", faculties.get(0), groups.get(2), disciplines.get(3), 7));

        students.add(new Student(3, "Ivanov", faculties.get(0), groups.get(1), disciplines.get(0), 7));
        students.add(new Student(3, "Ivanov", faculties.get(0), groups.get(1), disciplines.get(1), 10));
        students.add(new Student(3, "Ivanov", faculties.get(0), groups.get(1), disciplines.get(2), 4));
        students.add(new Student(3, "Ivanov", faculties.get(0), groups.get(1), disciplines.get(3), 6));

        students.add(new Student(4, "Berkova", faculties.get(1), groups.get(0), disciplines.get(0), 7));
        students.add(new Student(4, "Berkova", faculties.get(1), groups.get(0), disciplines.get(1), 4));
        students.add(new Student(4, "Berkova", faculties.get(1), groups.get(0), disciplines.get(2), 8));
        students.add(new Student(4, "Berkova", faculties.get(1), groups.get(0), disciplines.get(3), 9));

        students.add(new Student(5, "Lovich", faculties.get(1), groups.get(1), disciplines.get(0), 10));
        students.add(new Student(5, "Lovich", faculties.get(1), groups.get(1), disciplines.get(1), 7));
        students.add(new Student(5, "Lovich", faculties.get(1), groups.get(1), disciplines.get(2), 5));
        students.add(new Student(5, "Lovich", faculties.get(1), groups.get(1), disciplines.get(3), 9));

        students.add(new Student(6, "Shevtsov", faculties.get(1), groups.get(2), disciplines.get(0), 9));
        students.add(new Student(6, "Shevtsov", faculties.get(1), groups.get(2), disciplines.get(1), 5));
        students.add(new Student(6, "Shevtsov", faculties.get(1), groups.get(2), disciplines.get(2), 7));
        students.add(new Student(6, "Shevtsov", faculties.get(1), groups.get(2), disciplines.get(3), 8));

        students.add(new Student(7, "Gromova", faculties.get(2), groups.get(0), disciplines.get(0), 8));
        students.add(new Student(7, "Gromova", faculties.get(2), groups.get(0), disciplines.get(1), 10));
        students.add(new Student(7, "Gromova", faculties.get(2), groups.get(0), disciplines.get(2), 7));
        students.add(new Student(7, "Gromova", faculties.get(2), groups.get(0), disciplines.get(3), 9));

        students.add(new Student(8, "Sentsov", faculties.get(0), groups.get(1), disciplines.get(0), 9));
        students.add(new Student(8, "Sentsov", faculties.get(0), groups.get(1), disciplines.get(1), 5));
        students.add(new Student(8, "Sentsov", faculties.get(0), groups.get(1), disciplines.get(2), 10));
        students.add(new Student(8, "Sentsov", faculties.get(0), groups.get(1), disciplines.get(3), 7));

        students.add(new Student(9, "Kramko", faculties.get(2), groups.get(2), disciplines.get(0), 7));
        students.add(new Student(9, "Kramko", faculties.get(2), groups.get(2), disciplines.get(1), 10));
        students.add(new Student(9, "Kramko", faculties.get(2), groups.get(2), disciplines.get(2), 9));
        students.add(new Student(9, "Kramko", faculties.get(2), groups.get(2), disciplines.get(3), 10));

        students.add(new Student(10, "Sviridov", faculties.get(3), groups.get(0), disciplines.get(0), 10));
        students.add(new Student(10, "Sviridov", faculties.get(3), groups.get(0), disciplines.get(1), 9));
        students.add(new Student(10, "Sviridov", faculties.get(3), groups.get(0), disciplines.get(2), 7));
        students.add(new Student(10, "Sviridov", faculties.get(3), groups.get(0), disciplines.get(3), 10));

        students.add(new Student(11, "Modilin", faculties.get(3), groups.get(1), disciplines.get(0), 5));
        students.add(new Student(11, "Modilin", faculties.get(3), groups.get(1), disciplines.get(1), 7));
        students.add(new Student(11, "Modilin", faculties.get(3), groups.get(1), disciplines.get(2), 10));
        students.add(new Student(11, "Modilin", faculties.get(3), groups.get(1), disciplines.get(3), 9));

        students.add(new Student(12, "Sevina", faculties.get(3), groups.get(2), disciplines.get(0), 10));
        students.add(new Student(12, "Sevina", faculties.get(3), groups.get(2), disciplines.get(1), 5));
        students.add(new Student(12, "Sevina", faculties.get(3), groups.get(2), disciplines.get(2), 8));
        students.add(new Student(12, "Sevina", faculties.get(3), groups.get(2), disciplines.get(3), 9));

        students.add(new Student(13, "Kromvel", faculties.get(4), groups.get(0), disciplines.get(0), 10));
        students.add(new Student(13, "Kromvel", faculties.get(4), groups.get(0), disciplines.get(1), 8));
        students.add(new Student(13, "Kromvel", faculties.get(4), groups.get(0), disciplines.get(2), 9));
        students.add(new Student(13, "Kromvel", faculties.get(4), groups.get(0), disciplines.get(3), 10));

        students.add(new Student(14, "Zaborov", faculties.get(4), groups.get(1), disciplines.get(0), 9));
        students.add(new Student(14, "Zaborov", faculties.get(4), groups.get(1), disciplines.get(1), 8));
        students.add(new Student(14, "Zaborov", faculties.get(4), groups.get(1), disciplines.get(2), 10));
        students.add(new Student(14, "Zaborov", faculties.get(4), groups.get(1), disciplines.get(3), 10));

        students.add(new Student(15, "Plavina", faculties.get(4), groups.get(2), disciplines.get(0), 10));
        students.add(new Student(15, "Plavina", faculties.get(4), groups.get(2), disciplines.get(1), 7));
        students.add(new Student(15, "Plavina", faculties.get(4), groups.get(2), disciplines.get(2), 9));
        students.add(new Student(15, "Plavina", faculties.get(4), groups.get(2), disciplines.get(3), 10));

        students.add(new Student(16, "Damich", faculties.get(1), groups.get(0), disciplines.get(0), 7));
        students.add(new Student(16, "Damich", faculties.get(1), groups.get(0), disciplines.get(1), 8));
        students.add(new Student(16, "Damich", faculties.get(1), groups.get(0), disciplines.get(2), 9));
        students.add(new Student(16, "Damich", faculties.get(1), groups.get(0), disciplines.get(3), 10));

        students.add(new Student(17, "Somov", faculties.get(2), groups.get(1), disciplines.get(0), 10));
        students.add(new Student(17, "Somov", faculties.get(2), groups.get(1), disciplines.get(1), 10));
        students.add(new Student(17, "Somov", faculties.get(2), groups.get(1), disciplines.get(2), 7));
        students.add(new Student(17, "Somov", faculties.get(2), groups.get(1), disciplines.get(3), 9));

        students.add(new Student(18, "Krotov", faculties.get(3), groups.get(2), disciplines.get(0), 8));
        students.add(new Student(18, "Krotov", faculties.get(3), groups.get(2), disciplines.get(1), 5));
        students.add(new Student(18, "Krotov", faculties.get(3), groups.get(2), disciplines.get(2), 7));
        students.add(new Student(18, "Krotov", faculties.get(3), groups.get(2), disciplines.get(3), 10));

        students.add(new Student(19, "Melnov", faculties.get(4), groups.get(1), disciplines.get(0), 7));
        students.add(new Student(19, "Melnov", faculties.get(4), groups.get(1), disciplines.get(1), 5));
        students.add(new Student(19, "Melnov", faculties.get(4), groups.get(1), disciplines.get(2), 8));
        students.add(new Student(19, "Melnov", faculties.get(4), groups.get(1), disciplines.get(3), 10));

        students.add(new Student(20, "Stravinskiy", faculties.get(0), groups.get(0), disciplines.get(0), 10));
        students.add(new Student(20, "Stravinskiy", faculties.get(0), groups.get(0), disciplines.get(1), 10));
        students.add(new Student(20, "Stravinskiy", faculties.get(0), groups.get(0), disciplines.get(2), 10));
        students.add(new Student(20, "Stravinskiy", faculties.get(0), groups.get(0), disciplines.get(3), 10));

        students.add(new Student(21, "Rozhdestvenskiy", faculties.get(0), groups.get(2), disciplines.get(0), 10));
        students.add(new Student(21, "Rozhdestvenskiy", faculties.get(0), groups.get(2), disciplines.get(1), 9));
        students.add(new Student(21, "Rozhdestvenskiy", faculties.get(0), groups.get(2), disciplines.get(2), 7));
        students.add(new Student(21, "Rozhdestvenskiy", faculties.get(0), groups.get(2), disciplines.get(3), 10));

        UniversityInfoReceiver studList = new UniversityInfoReceiver(students, disciplines);
        studList.getStudentAverageMarkOnDisciplines(1, groups.get(0).getNumberGroup());
        studList.getAverageMarkByUniversityOnDiscipline(groups.get(0).getNumberGroup(), disciplines.get(1).getDisciplineName());
        studList.getAverageMarkByFacultyGroupOnDiscipline
                (faculties.get(0).getFacultyName(), groups.get(0).getNumberGroup(), disciplines.get(1).getDisciplineName());
    }
}