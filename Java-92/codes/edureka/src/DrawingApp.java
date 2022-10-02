import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape sh = null;
		//sh = new Shape(); //Cannot instantiate the type Shape
		
		System.out.print("which shape you want to work with[1.Rect | 2.Circle]? ");
		int shapeType = sc.nextInt();
		
		switch(shapeType) {
		 case 1:
			sh = new Rectangle("Yellow", 12, 8); 
			break;
		 case 2:
			sh = new Circle("Blue", 12.5f); 
			break;
		 default:
			System.out.println("This shape is not supported");
			return;
		}
		
		System.out.println();
		System.out.println("========================= SHAPE SELECTED: " + sh.getClass().getName().toUpperCase() + " =========================");
		
		System.out.println("Color of " + sh.getClass().getName() + " = " + sh.getColor());
		sh.area();
	}
}
