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
        int x = 5;
        int y = 5;
        Graph graph = new Graph(x,y);
        graph.doKruskal();
        graph.printGraph();
        //FreackingUselles.Kruskal kruskal = new FreackingUselles.Kruskal(graph);
        System.out.println("aboba");

    }
}