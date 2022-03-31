package by.epam.learn.UniversityExceptions;

public class GroupAbsenceException extends NullPointerException {

    public GroupAbsenceException(String groupMessage) {
        super(groupMessage);
    }
}