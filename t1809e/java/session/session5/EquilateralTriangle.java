public class EquilateralTriangle extends WeightTriangle {

    public EquilateralTriangle() {
    }

    public EquilateralTriangle(int edge1st, int edge2nd, int edge3rd) {
        if (edge1st == edge2nd && edge2nd == edge3rd) {
            this.setEdge1st(edge1st);
            this.setEdge2nd(edge2nd);
            this.setEdge3rd(edge3rd);
        } else {
            System.out.println("Error!");
        }
    }

}
