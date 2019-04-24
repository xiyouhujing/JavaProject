import java.util.*;

public class guessNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random MyRandom = new Random();
        int A = MyRandom.nextInt(101);
        int number;
        do {
            System.out.println("请猜一下电脑随机生成的数（0~100）");
            number = in.nextInt();
            if (number > A){
                System.out.println("大了");
            }else if(number < A){
                System.out.println("小了");
            }
        }while (number != A);
        System.out.println("恭喜你，猜对了！");
    }
}
