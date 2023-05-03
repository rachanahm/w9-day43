import java.util.*;
class InsertArrayList{
  public static void main(String args[]){
    ArrayList<String> shape=new ArrayList<String>();
    shape.add("hexagon");
    shape.add("circle");
    shape.add("rectangle");
    System.out.println(shape);
    shape.set(1,"pentagon");
    System.out.println(shape);
  }
}