class Rectangle{
  int length;
  int breadth;
   Rectangle(int l, int b){
    length = l;
    breadth = b;
  }
   int getArea(){
    return length*breadth;
  }
   int getPerimeter(){
    return 2*(length+breadth);
  }

  public static void main(String[] args){
    Rectangle a1 = new Rectangle(4,5);
    Rectangle b1 = new Rectangle(5,8);
    System.out.println("Area : "+a1.getArea()+" Perimeter is "+a1.getPerimeter());
    System.out.println("Area : "+b1.getArea()+" Perimeter is "+b1.getPerimeter());
  }
}






