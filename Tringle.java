class Triangle{
  int a,b,c;
    double getArea(){
    double s = (a+b+c)/2.0;
    return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
  }
    double getPerimeter(){
    return (a+b+c)/2.0;
  }

  public static void main(String[] args){
    Triangle t1 = new Triangle();
    t1.a = 3;
    t1.b = 4;
    t1.c = 5;
    System.out.println(t1.getArea());
    System.out.println(t1.getPerimeter());
  }
}
