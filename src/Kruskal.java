import java.util.Collections;
import java.util.List;

public class Kruskal {
    private Graph graph;
    private List<Edge> listOfEdges;
    public Kruskal (Graph graph){
        this.graph = graph;
        listOfEdges = graph.getListOfEdges();
        Collections.sort(listOfEdges);

    }
    public void doThing(){

    }



}
