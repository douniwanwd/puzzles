package dom;

public class Overloding2 {
    public void sum(int a, float f){
        System.out.println("First") ;
    }

    public void sum(float a, int b){
        System.out.println("Second") ;
    }

    public void main(String[] args) {
        Overloding2 ol=new Overloding2() ;
        float a = 1;
        double b = 1;
//        ol.sum(1,1);
    }
}
