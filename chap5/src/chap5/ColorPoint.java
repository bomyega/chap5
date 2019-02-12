package chap5;
class Point{
	int x,y;
	void set(int x,int y) {
		this.x=x;
		this.y=y;
	}
	void showPoint() {
		System.out.println(x+","+y);
	}
}
public class ColorPoint extends Point {
	String color;
	void setColor(String color) {
		this.color=color;
	}
	void setColorPrint() {
		System.out.print(color);
		showPoint();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint p=new ColorPoint();
		p.set(45, 2);
		p.setColor("yellow");
		p.setColorPrint();
		
	}

}
