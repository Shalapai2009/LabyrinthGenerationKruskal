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
        int x = 10;
        int y = 10;
        Graph graph = new Graph(x,y);
        graph.doKruskal();
        graph.printGraph();
        //FreackingUselles.Kruskal kruskal = new FreackingUselles.Kruskal(graph);
        System.out.println();
        TrueLabyrinth trueLabyrinth = new TrueLabyrinth(graph);
        trueLabyrinth.printLabyrinth();
        System.out.println("aboba");

    }
}