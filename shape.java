abstract class Shape 
{
    int x, y;
    abstract void printArea();
}
class Rectangle extends Shape 
	{
    Rectangle(int length, int breadth) 
	{
        x = length;
        y = breadth;
    }
    void printArea() 
	{
        System.out.println("Area of Rectangle = " + (x * y));
    }
}
class Triangle extends Shape 
	{
	Triangle(int base, int height) 
	{
        x = base;
        y = height;
    }
    void printArea() 
	{
        System.out.println("Area of Triangle = " + (0.5 * x * y));
    }
}
class Circle extends Shape 
	{
	Circle(int radius) 
	{
        x = radius;
    }
	void printArea() 
	{
        System.out.println("Area of Circle = " + (Math.PI * x * x));
    }
}
class shape
	{
    public static void main(String[] args) 
	{
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(10, 5);
        Circle c = new Circle(7);
        r.printArea();
        t.printArea();
        c.printArea();
    }
}
