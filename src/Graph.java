import java.util.*;
import java.util.logging.Logger;

public class Graph {
    private Vertex[][] vertexMatrix;
    private List<Edge> listOfEdges = new ArrayList<>();
    private List<Vertex> listOfVertex = new ArrayList<>();
    private List<VertexTree> listOfVertexTree = new ArrayList<>();
    public Graph(int x, int y){
        vertexMatrix = new Vertex[x][y];
        createField();
        giveVertexEdges();

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
                listOfVertex.add(vertexMatrix[i][j]);
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
                            int RandomRib = (int) (Math.random() * (10));

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
    public void doKruskal(){
        Collections.sort(listOfEdges);
        List<List<VertexTree>> ListOfEdgesOfTrees = new ArrayList<>();
        for (Vertex vertex: listOfVertex) {
            listOfVertexTree.add( new VertexTree(vertex));
        }
        /*for (Edge edge: listOfEdges) {
            ListOfEdgesOfTrees.add()
        }
        for (Edge edge: listOfEdges) {
            if (edge.getVertex1().getFinal != edge.getVertex2().getFinal){
                listOfVertexTree. getVertex1.addChildList(listOfVertexTree.getVertex2)
            }
        }*/
        listOfVertexTree.get(0).addChildList(listOfVertexTree.get(1));
        listOfVertexTree.get(0).addChildList(listOfVertexTree.get(2));
        listOfVertexTree.get(0).addChildList(listOfVertexTree.get(4));
        listOfVertexTree.get(1).addChildList(listOfVertexTree.get(3));
        listOfVertexTree.get(0).addChildList(listOfVertexTree.get(5));
        VertexTree vertexTree1 = listOfVertexTree.get(3).getFinal();

    }

    public List<Edge> getListOfEdges() {
        return listOfEdges;
    }
    public void generateListOfVertex(){
        for (Vertex[] matrix : vertexMatrix) {
            Collections.addAll(listOfVertex, matrix);
        }
    }
    public List<Vertex> getListOfVertex() {
        return listOfVertex;
    }

    public void setVertexMatrix(Vertex[][] vertexMatrix) {
        this.vertexMatrix = vertexMatrix;
    }

    public Vertex[][] getVertexMatrix() {
        return vertexMatrix;
    }
}
