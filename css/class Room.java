Class room
{
double length;
double breadth;
 
Rooms(double l, double b)
{
length=l;
breadth=b;
}
double area()
{
return length*breadth;
 }
}
class Office room extends room
{
double height;
office room (double length, double breadth, double height)
{
super(length,breadth);
height=height;
}
double volume()
{
return length*breadth*height;
 }
}
class InheritanceTest
{
public static void main(string args[])
{
office room orobj=new office(10,20,11);
 double rarea;
 double rvol;
area=orobj.area();
rvol=orobj.volume();

System.out.println("the area of office room is"+rarea);
System.out.println("the area of value office room is"+rvol);
 }
}