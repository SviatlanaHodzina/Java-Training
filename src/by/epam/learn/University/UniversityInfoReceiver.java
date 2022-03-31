package by.epam.learn.University;

import by.epam.learn.UniversityExceptions.*;

import java.util.ArrayList;

public class UniversityInfoReceiver {
    ArrayList<Student> students;
    ArrayList<Discipline> disciplines;

    public UniversityInfoReceiver(ArrayList<Student> students, ArrayList<Discipline> disciplines) {
        this.students = students;
        this.disciplines = disciplines;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int getAverageMarkByFacultyGroupOnDiscipline(String facultyToMark, int numOfGroupToMark, String disciplineToMark)
            throws FacultyAbsenceException, StudentAbsenceException, MarkValueException, GroupAbsenceException, DisciplineAbsenceException {
        int sumMark = 0;
        int numberOfMarks = 0;
        int averageMarkFaculty;
        for (Student student : students)
            if (!(students.isEmpty()) && (student.getFaculty().getFacultyName() == null)) {
                throw new FacultyAbsenceException("\"Faculty is absent\": ");
            } else if (!(students.isEmpty()) && student.getGroup() == null) {
                throw new GroupAbsenceException("\"Group is absent\": ");
            } else if (!(students.isEmpty()) && student.getDiscipline().getDisciplineName() == null) {
                throw new DisciplineAbsenceException("\"Discipline is absent\": ");
            } else if (student.getId() == 0 && student.getGroup().getNumberGroup() == numOfGroupToMark) {
                throw new StudentAbsenceException("\n Warning! StudentAbsentException: absent students: " +
                        " - " + student.getName() + " in the group #"
                        + student.getGroup().getNumberGroup() + " on Faculty " + "\""
                        + student.getFaculty().getFacultyName() + "\"");
            } else if (!(student.getId() == 0) && student.getMark() < 0 || student.getMark() > 10) {
                throw new MarkValueException("Mark value: " + student.getMark() + " is out of borders \n"
                        + "Group #1: " + "\n" + "Faculty: " + UniversityManager.FACULTY_1 + "\n"
                        + "Discipline: " + UniversityManager.DISCIPLINE_2);
            } else if (!(student.getId() == 0) && student.getFaculty().getFacultyName().equals(facultyToMark)
                    && (student.getDiscipline().getDisciplineName().equals(disciplineToMark))
                    && (student.getGroup().getNumberGroup() == numOfGroupToMark)) {
                sumMark += student.getMark();
                numberOfMarks = numberOfMarks + 1;
            }
        averageMarkFaculty = sumMark / numberOfMarks;
        System.out.println("Average mark: faculty " + "\"" + UniversityManager.FACULTY_1 + "\"" + "\n"
                + "\t\t\t Group #1 \n" + "\t\t\t Discipline " + "\"" + UniversityManager.DISCIPLINE_2 + "\": " + averageMarkFaculty + "\n");
        return averageMarkFaculty;
    }

    public int getStudentAverageMarkOnDisciplines(int idNum, int numOfGroupToMark) throws
            FacultyAbsenceException, StudentAbsenceException, MarkValueException, GroupAbsenceException, DisciplineAbsenceException {
        int sumDisciplinesMark = 0;
        int totalDisciplineMarks = 0;
        int averageMarkByDiscipline;
        for (Student student : students)
            if (!(students.isEmpty()) && (student.getFaculty().getFacultyName() == null)) {
                throw new FacultyAbsenceException("\"Faculty is absent\": ");
            } else if (!(students.isEmpty()) && student.getGroup() == null) {
                throw new GroupAbsenceException("\"Group is absent\": ");
            } else if (!(students.isEmpty()) && student.getDiscipline().getDisciplineName() == null) {
                throw new DisciplineAbsenceException("\"Discipline is absent\": ");
            } else if (student.getId() == 0 && student.getGroup().getNumberGroup() == numOfGroupToMark) {
                throw new StudentAbsenceException("\n Warning! StudentAbsentException: absent students: " +
                        " - " + student.getName() + " in the group #"
                        + student.getGroup().getNumberGroup() + " on Faculty " + "\""
                        + student.getFaculty().getFacultyName() + "\"");
            } else if (!(student.getId() == 0) && student.getMark() < 0 || student.getMark() > 10) {
                throw new MarkValueException("Mark value: " + student.getMark() + " is out of borders \n"
                        + "Group #1: " + "\n" + "Faculty: " + "\"" + UniversityManager.FACULTY_1 + "\"" + "\n"
                        + "Discipline: " + UniversityManager.DISCIPLINE_2);
            } else if (student.getId() == idNum) {
                sumDisciplinesMark += student.getMark();
                totalDisciplineMarks = totalDisciplineMarks + 1;
            }
        averageMarkByDiscipline = sumDisciplinesMark / totalDisciplineMarks;
        System.out.println("Average student's Id#" + getStudents().get(0).getId() + "- "
                + getStudents().get(0).getName() + " mark by Disciplines equals: " + averageMarkByDiscipline + "\n");
        return averageMarkByDiscipline;
    }

    public int getAverageMarkByUniversityOnDiscipline(int numOfGroupToMark, String disciplineToMark)
            throws FacultyAbsenceException, StudentAbsenceException, MarkValueException, GroupAbsenceException, DisciplineAbsenceException {
        int sumDisciplineMarkByUni = 0;
        int totalDisciplineMarksByUni = 0;
        int averageMarkOnDisciplineByUni;
        for (Student student : students)
            if (!(students.isEmpty()) && (student.getFaculty().getFacultyName() == null)) {
                throw new FacultyAbsenceException("\"Faculty is absent\": ");
            } else if (!(students.isEmpty()) && student.getGroup() == null) {
                throw new GroupAbsenceException("\"Group is absent\": ");
            } else if (!(students.isEmpty()) && student.getDiscipline().getDisciplineName() == null) {
                throw new DisciplineAbsenceException("\"Discipline is absent\": ");
            } else if (student.getId() == 0 && student.getGroup().getNumberGroup() == numOfGroupToMark) {
            throw new StudentAbsenceException("\n Warning! StudentAbsentException: absent students: " +
                    " - " + student.getName() + " in the group #"
                    + student.getGroup().getNumberGroup() + " on Faculty " + "\""
                    + student.getFaculty().getFacultyName() + "\"");
        } else if (!(student.getId() == 0) && student.getMark() < 0 || student.getMark() > 10) {
            throw new MarkValueException("Mark value: " + student.getMark() + " is out of borders \n"
                    + "Group #1: " + "\n" + "Faculty: " + UniversityManager.FACULTY_1 + "\n"
                    + "Discipline: " + UniversityManager.DISCIPLINE_2);
        } else if (!(student.getId() == 0) && student.getDiscipline().getDisciplineName().equals(disciplineToMark)) {
            sumDisciplineMarkByUni += student.getMark();
            totalDisciplineMarksByUni = totalDisciplineMarksByUni + 1;
        }
        averageMarkOnDisciplineByUni = sumDisciplineMarkByUni / totalDisciplineMarksByUni;
        System.out.println("Average mark on Discipline " + "\"" + disciplineToMark + "\""
                + " by University equals\": " + averageMarkOnDisciplineByUni + "\n");
        return averageMarkOnDisciplineByUni;
    }
}