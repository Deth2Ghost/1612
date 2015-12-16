package prj14;

public class Triangle {
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

