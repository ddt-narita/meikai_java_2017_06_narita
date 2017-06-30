/* 演習05-04
 * 3つの整数値を読み込んでその合計と平均を表示するプログラムの作成
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_05_04;

import java.util.Scanner;

public class SumAve {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);
		
		//合計と平均を求めることを明示
		System.out.println("3つの整数値xとyとzの合計と平均をもとめます。");
		//計算したい整数値の入力を促す
		System.out.print("整数X：");
		//1つ目の整数値を入力
		int nInputX = stdIn.nextInt();
		//計算したい2つ目の整数値の入力を促す
		System.out.print("整数Y：");
		//2つ目の整数値を入力する
		int nInputY = stdIn.nextInt();
		//計算したい3つ目の整数値の入力を促す
		System.out.print("整数Z：");
		//3つ目の値を入力する
		int nInputZ = stdIn.nextInt();
		
		//入力された3つの整数の合計を求める
		int nSum = (nInputX + nInputY + nInputZ);
		//入力された3つの整数の平均を求める
		double nAve = nSum / 3.0;
		//
		System.out.print("合計は" + nSum + "平均は" + nAve);
		
		//
		stdIn.close();
	}

}
