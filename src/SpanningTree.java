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
                /*if (edge.getVertex2().getParent()!=edge.getVertex2()){
                    System.out.println("НАЧАЛЬНИК ЗДЕСЬ НАСРАНО");
                }*/
                listOfTrue.add(edge);

            }
        }
    }

    public List<Edge> getListOfTrue() {
        return listOfTrue;
    }
}
