public class Point{
    int x;
    int y;
    Point (int a,int b){
        x=a;
        y=b; 
    }
    void Move (int a, int b) {
       
      x=x+a;
      y=y+b;
      
    } 

    double Distance (Point p){
        double res=0;
        res = Math.sqrt((Math.pow(p.x-x,2)) + (Math.pow(p.y-y,2)) );
        return res;

    }

    void Display (){
       
        System.out.println("x="+x+"y="+y);
    }

public static void main(String[] args) {
    Point A= new Point(1, 2);
    Point B= new Point(3, 4); 
    A.Move(1, 1);
    Double d =A.Distance(B);
    A.Display();
    System.out.println(d);

    

    
}
    
}