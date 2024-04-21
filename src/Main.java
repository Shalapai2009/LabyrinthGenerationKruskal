import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    [][][][][]
    [][][][][]
    [][][][][]
    [][][][][]
    [][][][][]
    */
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        Graph graph = new Graph(x,y);
        List<Edge> edges = graph.getListOfEdges();
        Kruskal kruskal = new Kruskal(graph);
        System.out.println("aboba");

    }
}