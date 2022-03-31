package by.epam.learn.University;

import java.util.ArrayList;

public class FacultyList {
    ArrayList<Faculty> faculties;

    FacultyList(ArrayList<Faculty> faculties) {
        this.faculties = faculties;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }
}