import java.util.List;

public class Edge implements Comparable<Edge>{
    private Vertex vertex1;
    private Vertex vertex2;
    private Color color = Color.BLACK;
    private Edge BROTHA;

    private int rib;
    public Edge(Vertex vertex1, Vertex vertex2, int rib){
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.rib = rib;
        //this.BROTHA = new Edge(vertex2,vertex1,rib);
        //setBROTHA();
    }

    public void setVertex1(Vertex vertex1) {
        this.vertex1 = vertex1;
    }

    public void setVertex2(Vertex vertex2) {
        this.vertex2 = vertex2;
    }


    public Vertex getVertex1() {
        return vertex1;
    }

    public Vertex getVertex2() {
        return vertex2;
    }

    public void setRib(int rib) {
        this.rib = rib;
    }

    public int getRib() {
        return rib;
    }

    @Override
    public int compareTo(Edge o) {
        return this.getRib() - o.getRib();
    }

    public Edge getBROTHA() {
        //setBROTHA(vertex1,vertex2,rib);
        return BROTHA;
    }

    public void setBROTHA(Vertex vertex1, Vertex vertex2, int rib) {
        this.BROTHA = new Edge(vertex2,vertex1,rib);
        BROTHA.setBROTHA(this);
    }
    public void setBROTHA(Edge edge) {
        this.BROTHA = edge;
        //BROTHA.setBROTHA();
    }
    public void setBROTHA() {
        this.BROTHA = new Edge(vertex2,vertex1,rib);
        BROTHA.setBROTHA(this);
    }

    /*public void setForBROTHA() {
        this.BROTHA.setBROTHA();
    }*/

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    public void makeBlack(){
        this.color = Color.BLACK;
    }
    public void makeRed(){
        this.color = Color.RED;
    }

    public static enum Color{
        BLACK,RED;
    }


}
