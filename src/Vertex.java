import java.util.ArrayList;

public class Vertex {

    private int x;
    private int y;
    private ArrayList<Edge> listEdge = new ArrayList<>();
    private boolean isolated = true;
    public Vertex(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void addEdge(Edge edge){
        listEdge.add(edge);
    }
    public void addEdge(Vertex vertex1, Vertex vertex2, int rib){
        listEdge.add(new Edge(vertex1, vertex2,rib));
    }

    public void unIsolation() {
        isolated = false;
    }

    public boolean isIsolated() {
        return isolated;
    }

    public ArrayList<Edge> getEdge(){
        return listEdge;
    }
    public boolean isIWasHere (Vertex vertex){
        for (Edge i : listEdge){
            if (i.getVertex2().equals(vertex)){
                return true;
            }
        }
        return false;
    }
    public void printXY(){
        System.out.println(x+" "+y);
    }
    public Boolean getBooleanDefiniteEdge(Edge edge){
        return listEdge.contains(edge);
    }
    public Edge removeEdge(int x){
        return listEdge.remove(x);
    }

}
