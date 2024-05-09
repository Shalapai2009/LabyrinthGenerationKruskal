import java.util.ArrayList;
import java.util.List;

public class SpanningTree {
    Graph graph;
     List<Edge> listOfTrue = new ArrayList<>();

    public SpanningTree(Graph graph){
        this.graph = graph;
    }

    public void createDaFuckingTrulyGoddessSpanningTree(){
        List<Edge> listOfEdge = graph.getListOfEdges();
        for (Edge edge: listOfEdge) {
            if (edge.getVertex2().getFinal() != edge.getVertex1().getFinal()){
                edge.getVertex1().addChildList(edge.getVertex2().getFinal());
                edge.makeRed();
                edge.getBROTHA().makeRed();
                listOfTrue.add(edge);

            }
        }
    }

    public List<Edge> getListOfTrue() {
        return listOfTrue;
    }
}
