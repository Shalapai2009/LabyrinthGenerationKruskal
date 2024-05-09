import java.util.ArrayList;
import java.util.List;

public class VertexTree {
    /*private Vertex vertex;
    private int size = 0;
    private List<VertexTree> vertexChildList = new ArrayList<>();
    private VertexTree vertexParent;

    public VertexTree(Vertex vertex) {
        this.vertex = vertex;
    }

    public Vertex getVertex() {
        return vertex;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addChildList(VertexTree vertexChild) {
        vertexChildList.add(vertexChild);
        vertexChild.setParent(this);
        //size = vertexChild.getSize()+1;
        updateSize(vertexChild);
    }

    public List<VertexTree> getVertexChildList() {
        return vertexChildList;
    }
    public void setParent(VertexTree vertexParent) {
        this.vertexParent = vertexParent;
    }

    public VertexTree getVertexParent() {
        return vertexParent;
    }
    public VertexTree getFinal(){
        VertexTree mineVertex = this;
        while (mineVertex.getVertexParent() != null){
            mineVertex = mineVertex.getVertexParent();
        }
     return mineVertex;
    }
    public void updateSize(VertexTree vertexChild){
        VertexTree mineVertex = vertexChild;
        while (mineVertex.getVertexParent() != null){
            int currentSize = mineVertex.getSize();
            mineVertex = mineVertex.getVertexParent();
            // ОПАСНООООООООООООООООООООООООООООО
            if (mineVertex.getSize() <= currentSize){
            mineVertex.setSize(currentSize+1);}
        }
    }*/

}
