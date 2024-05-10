package FreackingUselles;

import java.util.ArrayList;
import java.util.List;

public class VertexTree {
    /*private Vertex vertex;
    private int size = 0;
    private List<FreackingUselles.VertexTree> vertexChildList = new ArrayList<>();
    private FreackingUselles.VertexTree vertexParent;

    public FreackingUselles.VertexTree(Vertex vertex) {
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

    public void addChildList(FreackingUselles.VertexTree vertexChild) {
        vertexChildList.add(vertexChild);
        vertexChild.setParent(this);
        //size = vertexChild.getSize()+1;
        updateSize(vertexChild);
    }

    public List<FreackingUselles.VertexTree> getVertexChildList() {
        return vertexChildList;
    }
    public void setParent(FreackingUselles.VertexTree vertexParent) {
        this.vertexParent = vertexParent;
    }

    public FreackingUselles.VertexTree getVertexParent() {
        return vertexParent;
    }
    public FreackingUselles.VertexTree getFinal(){
        FreackingUselles.VertexTree mineVertex = this;
        while (mineVertex.getVertexParent() != null){
            mineVertex = mineVertex.getVertexParent();
        }
     return mineVertex;
    }
    public void updateSize(FreackingUselles.VertexTree vertexChild){
        FreackingUselles.VertexTree mineVertex = vertexChild;
        while (mineVertex.getVertexParent() != null){
            int currentSize = mineVertex.getSize();
            mineVertex = mineVertex.getVertexParent();
            // ОПАСНООООООООООООООООООООООООООООО
            if (mineVertex.getSize() <= currentSize){
            mineVertex.setSize(currentSize+1);}
        }
    }*/

}
