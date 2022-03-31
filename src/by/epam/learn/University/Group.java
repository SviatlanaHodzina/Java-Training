package by.epam.learn.University;

import java.util.Objects;

public class Group extends Student {

    int numberGroup;

    public Group(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    @Override
    public String toString() {
        return "Group{" +
                "numberGroup=" + numberGroup +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Group group = (Group) o;
        return numberGroup == group.numberGroup;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberGroup);
    }
}