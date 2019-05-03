public class Triangular {
    private int edge1st;
    private int edge2nd;
    private int edge3rd;

    public Triangular() {
    }

    public Triangular(int edge1st, int edge2nd, int edge3rd) {
        if(isCheck(edge1st, edge2nd, edge3rd)){
        this.edge1st = edge1st;
        this.edge2nd = edge2nd;
        this.edge3rd = edge3rd;
        } else {
            System.out.println("Error!");
        }
    }

    public int getEdge1st() {
        return edge1st;
    }

    public void setEdge1st(int edge1st) {
        this.edge1st = edge1st;
    }

    public int getEdge2nd() {
        return edge2nd;
    }

    public void setEdge2nd(int edge2nd) {
        this.edge2nd = edge2nd;
    }

    public int getEdge3rd() {
        return edge3rd;
    }

    public void setEdge3rd(int edge3rd) {
        this.edge3rd = edge3rd;
    }

    public int CalculateCircumference() {
        return this.edge1st + this.edge2nd + this.edge3rd;
    }

    public double CalculateArea() {
        double temp = (double) (this.edge1st + this.edge2nd + this.edge3rd) / 2;
        return (float) Math.sqrt(temp * (temp - this.edge1st) * (temp - this.edge2nd) * (temp - this.edge3rd));
    }

    private boolean isCheck(int edge1st, int edge2nd, int edge3rd){
        return (((edge1st + edge2nd) > edge3rd && (edge1st + edge3rd) > edge2nd && (edge3rd + edge2nd) > edge1st ));
    }
}
