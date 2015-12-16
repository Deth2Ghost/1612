package prj14;

public class Line {
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