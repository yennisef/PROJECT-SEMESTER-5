public class Point {
    private int x, y;
		public Point (int x, int y) {
			this.x = x ;
			this.y = y ;
	}
	public Point() {
		this(10,10);
	}
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println("x = " + p.x);
        System.out.println("y = " + p.y);
    }
}
