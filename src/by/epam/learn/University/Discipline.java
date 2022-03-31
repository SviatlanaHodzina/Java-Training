package by.epam.learn.University;

import java.util.Objects;

public class Discipline {
    String disciplineName;

    public Discipline(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "disciplineName='" + disciplineName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discipline that = (Discipline) o;
        return Objects.equals(disciplineName, that.disciplineName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disciplineName);
    }
}