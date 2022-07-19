package D20220719;

import java.util.*;

/**
 * 1971. Find if Path Exists in Graph
 */
public class Q1971 {

    public static boolean validPath(int n, int[][] edges, int source, int destination) {

        Map<Integer, List<Integer>> path = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> que = new LinkedList<>();

        for(int[] edge : edges) {
            path.putIfAbsent(edge[0], new ArrayList<>());
            path.putIfAbsent(edge[1], new ArrayList<>());
            path.get(edge[0]).add(edge[1]);
            path.get(edge[1]).add(edge[0]);
        }

        visited.add(source);
        que.add(source);

        while(!que.isEmpty()) {
            int curr = que.poll();
            if(curr == destination) return true;

            for(Integer next : path.get(curr)) {
                if(!visited.contains(next)) {
                    visited.add(next);
                    que.add(next);
                }
            }
        }

        return false;
    }
}
