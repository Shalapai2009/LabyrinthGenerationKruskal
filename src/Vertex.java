import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int x;
    private int y;
    private Type type = Type.Empty;
    private ArrayList<Edge> listEdge = new ArrayList<>();
    //private boolean isolated = true;
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

    /*public void unIsolation() {
        isolated = false;
    }

    public boolean isIsolated() {
        return isolated;
    }*/

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
    // Здесь отступает жизнь
    // Зажатая в тески
    // Полуденной жары
    // Надвигаются, ПЕСКИ
    private int size = 0;
    private List<Vertex> vertexChildList = new ArrayList<>();
    private Vertex vertexParent = this;

   /* public VertexTree(Vertex vertex) {
        this.vertex = vertex;
    }*/

    public Vertex getVertex() {
        return this;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addChildList(Vertex vertexChild) {
        vertexChildList.add(vertexChild);
        vertexChild.setParent(this);
        //size = vertexChild.getSize()+1;
        updateSize(vertexChild);
    }
    //public void Union(Vertex v)

    public List<Vertex> getVertexChildList() {
        return vertexChildList;
    }
    public void setParent(Vertex vertexParent) {
        this.vertexParent = vertexParent;
    }

    public Vertex getParent() {
        return vertexParent;
    }
    public Vertex getFinal(){
        Vertex mineVertex = this;
        while (mineVertex.getParent() != mineVertex){
            mineVertex = mineVertex.getParent();
        }
        return mineVertex;
    }
    public void updateSize(Vertex vertexChild){
        Vertex mineVertex = vertexChild;
        while (mineVertex.getParent() != mineVertex){
            int currentSize = mineVertex.getSize();
            mineVertex = mineVertex.getParent();
            // ОПАСНООООООООООООООООООООООООООООО
            if (mineVertex.getSize() <= currentSize){
                mineVertex.setSize(currentSize+1);}
        }
    }
    public void makeEmpty(){
        this.type = Type.Empty;
    }
    public void makeFull(){
        this.type = Type.Full;
    }
    public static enum Type {
        Empty,Full;
    }

}
