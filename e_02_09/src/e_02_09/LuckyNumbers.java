/* 演習02-09
 * 3つのランダムな実数値を表示するプログラムの作成
 * 作成日：6月28日
 * 作成者：成田修之
 */


package e_02_09;

import java.util.Random;

public class LuckyNumbers {
	public static void main(String[] arg) {
		//ランダムな値を生成するインスタンスを生成
		Random rand = new Random();

		//0.0から1.0までの実数を代入
		double lucky1 = rand.nextDouble();
		//0.0から1.0までの実数を10でかけて0.0から10.0までの実数を表現
		double lucky2 = rand.nextDouble() * 10 ;
		//0.0から1.0までの実数から0.0から1.0までの実数を引いて-1.0から1.0までの値を表現
		double lucky3 = rand.nextDouble() - rand.nextDouble();

		//0.0から1.0までの実数を表示
		System.out.println("0.0から1.0までの実数 ：" + lucky1);
		//0.0から10.0までの実数を表示
		System.out.println("0.0から10.0までの実数：" + lucky2);
		//-1.0から1.0までの実数を表示
		System.out.println("-1.0から1.0までの実数：" + lucky3);

	}
}
