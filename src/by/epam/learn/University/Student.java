package by.epam.learn.University;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private Faculty faculty;
    private Group group;
    private Discipline discipline;
    private int mark;

    public Student(int id, String name, Faculty faculty, Group group, Discipline discipline, int mark) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        this.group = group;
        this.discipline = discipline;
        this.mark = mark;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group groups) {
        this.group = groups;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", faculty=" + faculty +
                ", group=" + group +
                ", discipline=" + discipline +
                ", mark=" + mark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && mark == student.mark && Objects.equals(name, student.name)
                && Objects.equals(faculty, student.faculty) && Objects.equals(group, student.group)
                && Objects.equals(discipline, student.discipline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, faculty, group, discipline, mark);
    }
}