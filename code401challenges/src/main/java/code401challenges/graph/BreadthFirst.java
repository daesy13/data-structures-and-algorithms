package code401challenges.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class BreadthFirst {
    public static List<String> breadthFirst(Graph init){
        List<String> result = new LinkedList<>();
        Set<Graph> seen = new HashSet<>();
        LinkedList<Graph> nodesToProcess = new LinkedList<>();
        nodesToProcess.addLast(init);
        seen.add(init);
        while (!nodesToProcess.isEmpty()){
            Graph current = nodesToProcess.removeFirst();
            result.add(current.value);
            for(Graph neighbor : current.getNeighbors()){
                if(!seen.contains(neighbor)){
                    seen.add(neighbor);
                    nodesToProcess.addLast(neighbor);
                }
            }
        }
        return result;
    }
}
