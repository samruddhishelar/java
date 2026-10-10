abstract class Shape 
{
    abstract void area();
    abstract void volume();
}

class Cylinder extends Shape 
	{
    double radius;
    double height;
    Cylinder(double radius, double height) 
	{
        this.radius = radius;
        this.height = height;
    }

    void area() 
	{
        double a = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface Area of Cylinder = " + a);
    }
    void volume() 
	{
        double v = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder = " + v);
    }
}

class ShapeDemo 
	{
    public static void main(String[] args) 
	{
        Cylinder c = new Cylinder(5, 10);
        c.area();
        c.volume();
    }
}
