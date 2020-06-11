import java.util.*;
class Area{
  int length;
  int breadth;
  public Area(int l, int b){
    length = l;
    breadth = b;
  }
  public int getArea(){
    return length*breadth;
  }


  public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);
    int l,b;

    System.out.println("Enter length");
    l = s1.nextInt();
    System.out.println("Enter breadth");
    b = s1.nextInt();

    Area a1 = new Area(l,b);
    System.out.println("Area : "+a1.getArea());
}
}


