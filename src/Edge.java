import java.util.List;

public class Edge implements Comparable<Edge>{
    private Vertex vertex1;
    private Vertex vertex2;
    private int rib;
    //private List<Vertex> list;
    //private List<Vertex> listReverse;
    public Edge(Vertex vertex1, Vertex vertex2, int rib){
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        //list.set(0,vertex1);
        //list.set(1,vertex2);
        this.rib = rib;
    }

    public void setVertex1(Vertex vertex1) {
        this.vertex1 = vertex1;
        //list.set(0,vertex1);
    }

    public void setVertex2(Vertex vertex2) {
        this.vertex2 = vertex2;
        //list.set(1,vertex2);
    }


    public Vertex getVertex1() {
        return vertex1;
    }

    public Vertex getVertex2() {
        return vertex2;
    }

    public int getRib() {
        return rib;
    }

    @Override
    public int compareTo(Edge o) {
        return this.getRib() - o.getRib();
    }

    /*public List<Vertex> getListVertex(){
        return list;
    }*/
  /*  public void reverseVertex(){
        Vertex trash;
        trash = vertex1;
        vertex1 = vertex2;
        vertex2 = trash;
    }*/
    /*public List<Vertex> getListReverseVertex(){
        listReverse.add(list.get(1));
        listReverse.add(list.get(0));
        return listReverse;
    }*/

}
