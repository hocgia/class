public class WeightTriangle extends Triangular {

    public WeightTriangle() {
    }

    public WeightTriangle(int edge1st, int edge2nd, int edge3rd) {
        if (super.getEdge1st() == super.getEdge2nd() || super.getEdge1st() == super.getEdge3rd() || super.getEdge2nd() == super.getEdge3rd()) {
            this.setEdge1st(edge1st);
            this.setEdge2nd(edge2nd);
            this.setEdge3rd(edge3rd);
        } else {
            System.out.println("Error");
        }
    }

}
