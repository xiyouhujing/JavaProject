import java.util.Scanner;

public class guess{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("----------猜拳游戏----------");
        System.out.println("请出拳（1.石头 2.剪刀 3.布）");
        int person = in.nextInt();
        int computer = (int)(Math.random()*3)+1;
        String marks1 = "石头";
        String marks2 = "石头";
        switch (person){
            case 1:
                marks1 = "石头";
                break;
            case 2:
                marks1 = "剪刀";
                break;
            case 3:
                marks1 = "布";
                break;
        }
        switch (computer){
            case 1:
                marks2 = "石头";
                break;
            case 2:
                marks2 = "剪刀";
                break;
            case 3:
                marks2 = "布";
                break;
        }
        System.out.println("你出的是：" + marks1 + "，电脑出的是：" + marks2);
        if (person == computer){
            System.out.println("你们是平局");
        }else if (person==1 && computer==2 || person==2 && computer==3 || person==3 && computer==1){
            System.out.println("恭喜你，你赢了！");
        }else {
            System.out.println("很遗憾，你输了！");
        }
    }
}