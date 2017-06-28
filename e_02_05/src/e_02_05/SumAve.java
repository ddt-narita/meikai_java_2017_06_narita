/* 演習02-05
 * 2つの実数値を読み込んでその和と平均を求めて表示するプログラムの作成
 * 作成日：6月27日
 * 作成者：成田修之
 */


package e_02_05;

import java.util.Scanner;

public class SumAve {

	public static void main(String[] args) {
		//キーボードからの入力に使う標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//xに値の入力を促す
		System.out.print("xの値：");
		//変数nInputXに合計と平均を求めたい値をキーボードから入力
		double dblInputX = stdIn.nextDouble();

		//yに値の入力を促す
		System.out.print("yの値：");
		//変数nInputYに合計と平均を求めたい値をキーボードから入力
		double dblInputY = stdIn.nextDouble();

		//入力された2つの値の合計を表示
		System.out.println("合計は" + (dblInputX + dblInputY));
		//入力された2つの値の平均を表示
		System.out.println("平均は" + ((dblInputX + dblInputY) / 2));

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
