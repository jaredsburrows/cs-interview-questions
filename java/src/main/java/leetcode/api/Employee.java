package leetcode.api;

import java.util.List;
import java.util.Objects;

public final class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Employee employee)) {
            return false;
        }

        return id == employee.id
            && importance == employee.importance
            && Objects.equals(subordinates, employee.subordinates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, importance, subordinates);
    }
}
