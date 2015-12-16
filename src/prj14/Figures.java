package prj14;
import prj14.ColorAble;



class Point {
	private int x, y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}

class ColorPoint extends Point implements ColorAble {
	private int color;

	public ColorPoint(int x, int y, int color) {
		super(x, y);
		this.color = color;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

}

class Line {
	Point start, end;

	public Line(Point start, Point end) {
		super();
		this.start = start;
		this.end = end;
	}

	public Point getStart() {
		return start;
	}

	public void setStart(Point start) {
		this.start = start;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public Line(int x1, int y1, int x2, int y2) {
		start = new Point(x1, y1);
		end = new Point(x2, y2);
	}
}

class ColorLine extends Line implements ColorAble {
	int color;

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public ColorLine(Point start, Point end, int color) {
		super(start, end);
		this.color = color;
	}

	public ColorLine(Line l, int color) {
		super(l.getStart(), l.getEnd());
		this.color = color;
	}
}

class Triangle {
	private Point apexA, apexB, apexC;
	private Line sideA, sideB, sideC;

	public Triangle(Point apexA, Point apexB, Point apexC) {
		super();
		this.apexA = apexA;
		this.apexB = apexB;
		this.apexC = apexC;
		sideA = new Line(apexB, apexC);
		sideB = new Line(apexA, apexC);
		sideC = new Line(apexA, apexB);
	}
}

class ColorTriangle extends Triangle implements ColorAble {
	int color;

	public ColorTriangle(Point apexA, Point apexB, Point apexC, int color) {
		super(apexA, apexB, apexC);
		this.color = color;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

}

public class Figures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(1, 1);
		Point b = new Point(2, 2);
		ColorPoint cp = new ColorPoint(3, 3, 6666);
		Line l1 = new Line(a, b);
		Line l2 = new Line(3, 3, 4, 4);
		Line l3 = new Line(new Point(5, 5), new Point(6, 6));
		ColorLine cl1 = new ColorLine(a, b, 777777);
		ColorTriangle ctr = new ColorTriangle(a, b, new Point(9, 9), 888888);
		ColorAble[] colorFigure = new ColorAble[3];
		colorFigure[0] = cp;
		colorFigure[1] = cl1;
		colorFigure[2] = ctr;
		for (int i = 0; i < colorFigure.length; i++) {
			colorFigure[i].getColor();
		}
	}

}
