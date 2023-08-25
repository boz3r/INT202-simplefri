package sit.int202.simplefri.repositories;

import sit.int202.simplefri.entities.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectRepository {
    private static List<Subject> subjects;

    public List<Subject> findAll() {
        return subjects;
    }

    public SubjectRepository() {
        initialize();
    }

    private void initialize() {
        subjects = new ArrayList<>(20);
        subjects.add(new Subject("INT100", "IT Fund", 3));
        subjects.add(new Subject("INT101", "Programming I", 3));
        subjects.add(new Subject("INT103", "Programming II", 3));
        subjects.add(new Subject("INT201", "Frontend", 3));
        subjects.add(new Subject("INT202", "Backend", 3));
        subjects.add(new Subject("INT207", "Network I", 3));
    }
}
