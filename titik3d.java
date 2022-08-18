public class titik3d extends titik {
    public int z ;
    public titik3d () {
        super ();
        z = 6;
    }
    public titik3d (int x1, int y1, int z1) {
        super (x1,y1);
        z = z1;
    }
    public void setz (int z1) {
        z=z1;
    }
    public int getz() {
        return z;
    }
}
