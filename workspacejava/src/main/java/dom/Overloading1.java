package dom;

public class Overloading1 {
    public void sum(double d1, double d2){
        System.out.println("Primitive");
    }

    public void sum(Double d1, Double d2){
        d1 = d1 + 2;
        System.out.println(d1);
        System.out.println("Wrapper");
    }

    public static void main(String[] args) {
        Overloading1 ol=new Overloading1() ;
        Double test = 123.45;
        ol.sum(test,null);
        System.out.println(test);

        User user = new User();
        user.setUsername("zhangsan");
        user.setAge(18);
        ol.modify(user);
        System.out.println(user.getUsername());
        System.out.println(user.getAge());
    }

    public void modify(User user) {
        user.setUsername("modify");
        user.setAge(19);
        System.out.println(user.getUsername());
        System.out.println(user.getAge());
    }
}
