package D20211029;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 690. Employee Importance
 */
public class Q0690 {

    public static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    public int getImportance(List<Employee> employees, int id) {

        if(employees.size() == 0) return 0;

        int count = 0;
        Queue<Integer> que = new LinkedList<>();
        que.add(id);

        while(!que.isEmpty()) {
            int currId = que.poll();
            for(Employee employee : employees) {
               if(currId == employee.id) {
                   count += employee.importance;
                   if(employee.subordinates != null) {
                       que.addAll(employee.subordinates);
                   }
               }
            }
        }
        return count;
    }
}


