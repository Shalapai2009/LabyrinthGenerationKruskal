import java.util.ArrayList;

public class Vertex {
    private ArrayList<Edge> list = new ArrayList<>();
    private int x;
    private int y;
    public Vertex(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void addEdge(Edge edge){
        list.add(edge);
    }
    public void addEdge(Vertex vertex1, Vertex vertex2){
        list.add(new Edge(vertex1, vertex2));
    }
    public ArrayList<Edge> getEdge(){
        return list;
    }
    public Boolean getBooleanDefiniteEdge(Edge edge){
        return list.contains(edge);
    }
    public Edge removeEdge(int x){
        return list.remove(x);
    }

}
