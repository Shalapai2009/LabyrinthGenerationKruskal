import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Graph {
    private Vertex[][] vertexMatrix;
    private List<Edge> listOfEdges = new ArrayList<>();
    public Graph(int x, int y){
        vertexMatrix = new Vertex[x][y];
        createField();
        giveVertexEdges();
       listOfEdges = getListOfEdges();
    }
    public Vertex getVertex(int x,int y){
        try {
            return vertexMatrix[x][y];
        } catch (Exception e) {
            return null;
        }

    }
    public int[] getVertexCoordinates(Vertex vertex){
        int[] vertexCoordinates = new int[2];
        for (int i = 0; i < vertexMatrix.length; i++) {
            for (int j = 0; j < vertexMatrix[i].length; j++) {
                if (vertexMatrix[i][j] == vertex){
                    vertexCoordinates[0] =i; vertexCoordinates[1] =j;
                    return vertexCoordinates;
                }
            }
        }
        return null;
    }
    public void createField(){
        for (int i = 0; i < vertexMatrix.length; i++) {
            for (int j = 0; j < vertexMatrix[i].length; j++) {
                vertexMatrix[i][j] = new Vertex(i,j);
            }
        }
    }
    public void giveVertexEdges(){
        Deque<Vertex> deque = new ArrayDeque<>();
        deque.add(vertexMatrix[0][0]);
        while (deque.size()>0){
        Vertex currentVertex = deque.pop();
            int[] currentVertexCoordinates = getVertexCoordinates(currentVertex);
            int currentVertexX = currentVertexCoordinates[0];
            int currentVertexY = currentVertexCoordinates[1];
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    if ((i!=0 & j==0) | (i==0 & j!=0)){
                        Vertex mineVertex = getVertex(currentVertexX+i,currentVertexY+j);
                        if (mineVertex != null && (!currentVertex.isIWasHere(mineVertex))){

                            int RandomRib = (int) (Math.random() * (100));

                            Edge mineEdge = new Edge(currentVertex, mineVertex, RandomRib);
                            currentVertex.addEdge(new Edge(currentVertex, mineVertex, RandomRib));

                            mineVertex.addEdge(new Edge(mineVertex, currentVertex, RandomRib));

                            listOfEdges.add(mineEdge);

                            deque.add(mineVertex);
                            }
                    }
                }
            }
        }
    }

    public List<Edge> getListOfEdges() {
        return listOfEdges;
    }

    public void setVertexMatrix(Vertex[][] vertexMatrix) {
        this.vertexMatrix = vertexMatrix;
    }

    public Vertex[][] getVertexMatrix() {
        return vertexMatrix;
    }
}
