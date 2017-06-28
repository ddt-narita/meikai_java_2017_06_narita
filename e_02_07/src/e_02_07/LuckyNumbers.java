/* 演習02-07
 * 3つのランダムな整数値を表示するプログラムの作成
 * 作成日：6月27日
 * 作成者：成田修之
 */

package e_02_07;

//ランダムな値を生成するクラスRandomをインポート
import java.util.Random;

public class LuckyNumbers {
	public static void main (String[] arg) {
		//ランダムな値を生成するインスタンスを生成
		Random rand = new Random();

		//0から8の整数を生成して1を足した数で1桁の正の整数を表現
		int lucky1 = rand.nextInt(9) + 1;
		//0から8の整数を生成して9引いた数で1桁の負の整数を表現
		int lucky2 = rand.nextInt(9) - 9;
		//0から89の整数を生成して10足すことで2桁の正の整数を表現
		int lucky3 = rand.nextInt(90) + 10;

		//作った1桁の正の整数を表示
		System.out.println("1桁の正の整数：" + lucky1);
		//1桁の負の整数を表示
		System.out.println("1桁の負の整数：" + lucky2);
		//2桁の正の整数を表示
		System.out.println("2桁の正の整数：" + lucky3);
	}
}
