import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入时间戳数字：");
        long x=input.nextInt();
        long d=x/86400;    //天数
        long y1=d/1461;    //有多少个闰年
        long yy=d%1461;    //最后一个闰年后余下天数
        long y2=yy/365;    //闰年后有多少年
        long y=y1+y2;
    }
}
