import java.util.Scanner;
import java.util.Random;

public class kazuate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int ans = rand.nextInt(90) + 10;

        for(int i = 0; i <5;i++){
            System.out.println("数値を予想してください");
            int predict = scanner.nextInt();
            if(predict==ans){
                System.out.println("当たり");
                break;
            }
            else if(predict>ans){
                System.out.println("正解はそれより小さい値です");
            }
            else if(predict<ans){
                System.out.println("正解はそれより大きい値です");
            }
            if(Math.abs(predict-ans)>20){
                System.out.println("差が20以上です");
            }
        }
    }
}
