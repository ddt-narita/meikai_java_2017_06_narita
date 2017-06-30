/* 演習05-05
 * 3つの整数値を読み込んでその合計と平均を表示するプログラムの作成。平均はキャスト演算子を利用して求めて実数で表示
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_05_05;

import java.util.Scanner;

public class Cast {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//3つの整数値の合計と平均を求めることを表示
		System.out.println("3つの整数値の合計と平均を求めます。");
		//計算したい整数Xに入力を促す
		System.out.print("整数X：");
		//変数Xに入力
		int nInputX = stdIn.nextInt();
		//計算したい値の入力を促す
		System.out.print("整数Y：");
		//変数Yに入力
		int nInputY = stdIn.nextInt();
		//計算したい値の入力を促す
		System.out.print("整数Z：");
		//変数Zに入力
		int nInputZ = stdIn.nextInt();

		//入力された3つの整数値の合計を求める
		int nSum = nInputX + nInputY + nInputZ;
		//合計をdouble型にキャストして平均を実数値で求める
		double nAve = (double)(nSum) / 3;

		//入力された3つの整数値の求めた合計と平均値を表示する
		System.out.println("合計は" + nSum + "平均は" + nAve + "です。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
