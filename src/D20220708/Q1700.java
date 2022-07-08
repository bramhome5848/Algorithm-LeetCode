package D20220708;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1700. Number of Students Unable to Eat Lunch
 */
public class Q1700 {

    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> studentQue = new LinkedList<>();
        Queue<Integer> sandQue = new LinkedList<>();

        for(int student : students)studentQue.add(student);
        for(int sandwich : sandwiches) sandQue.add(sandwich);

        while(!studentQue.isEmpty() && !sandQue.isEmpty()) {
            int student = studentQue.poll();
            if(!sandQue.isEmpty() && sandQue.peek() == student) {
                sandQue.poll();
            } else {
                if(studentQue.contains(sandQue.peek())) {
                    studentQue.add(student);
                    break;
                }
                studentQue.add(student);
            }
        }

        return studentQue.size();
    }
}
