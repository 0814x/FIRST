import java.awt.desktop.SystemEventListener;

public class Main {
    public static void main(String[] args) {
        int a=12,b=9;
        add add1=new add();
        sub sub1=new sub();
        System.out.println(add1.add_func(a,b));
        /*java: sub_func(int,int) 在 sub 中是 private 访问控制
        System.out.println(sub1.sub_func(a,b));
        * */


    }
}