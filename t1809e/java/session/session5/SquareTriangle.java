public class SquareTriangle extends Triangular {

    public SquareTriangle() {
    }

    public SquareTriangle(int edge1st, int edge2nd, int edge3rd) {
        if (isCheck(edge1st, edge2nd, edge3rd)) {
            this.setEdge1st(edge1st);
            this.setEdge2nd(edge2nd);
            this.setEdge3rd(edge3rd);
        } else {
            System.out.println("Error");
        }
    }

    private boolean isCheck(int edge1st, int edge2nd, int edge3rd) {
        double temp1 = Math.pow(edge1st, 2);
        double temp2 = Math.pow(edge2nd, 2);
        double temp3 = Math.pow(edge3rd, 2);
        return (temp1 + temp2 == temp3 || temp1 + temp3 == temp2 || temp2 + temp3 == temp1);
    }
}
