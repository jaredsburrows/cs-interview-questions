package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import leetcode.api.Employee;

/**
 * https://leetcode.com/problems/employee-importance/
 */
public final class Problem690EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }

        return getImportance(map, id);
    }

    private int getImportance(Map<Integer, Employee> map, int id) {
        Employee employee = map.get(id);
        int importance = employee.importance;
        for (Integer number : employee.subordinates) {
            importance += getImportance(map, number);
        }

        return importance;
    }
}
