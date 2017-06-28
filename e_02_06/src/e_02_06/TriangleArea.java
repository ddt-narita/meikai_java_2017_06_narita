/* 演習02-06
 * 三角形の底辺と高さを読み込んでその面積を表示するプログラムの作成
 * 作成日：6月27日
 * 作成者：成田修之
 */


package e_02_06;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//三角形の面積を求めていくことを明示
		System.out.println("三角形の面積を求めます。");

		//底辺の長さの入力を促す
		System.out.print("底辺：");
		//底辺の長さをキーボードから入力
		double nBase = stdIn.nextDouble();

		//高さの長さの入力を促す
		System.out.print("高さ：");
		//高さの長さをキーボードから入力
		double nHeight = stdIn.nextDouble();

		//入力された底辺と高さから三角形の面積を求めて表示
		System.out.print("面積は" + ((nBase * nHeight) / 2) + "です。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
