/* 演習06-08
 * double型の配列の全要素の合計値と平均値を求めるプログラムの作成
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_06_08;

import java.util.Scanner;

public class DblArray {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//配列に要素数と要素の入力を促す表示
		System.out.println("double型の配列に要素を入力してください。");
		//要素数の入力を促す
		System.out.print("要素数：");
		//配列の要素数を入力
		int nArrayNumber = stdIn.nextInt();

		//入力された要素数の配列を作成
		double[] dblArray = new double[nArrayNumber];

		//要素数分だけ繰り返す
		for(int i = 0; i < nArrayNumber; i++) {
			//各要素に入力を促す
			System.out.print("nArray[" + i + "] = ");
			//各要素にdouble型の値を格納
			dblArray[i] = stdIn.nextDouble();
		}

		//全生徒の合計を求めるための変数
		double dblSum = 0;
		//全生徒の配列の最初から最後までを操作
		for(double i : dblArray) {
			//合計を求める変数に加算する
			dblSum += i;
		}

		//求めた配列の全要素の合計と平均を表示する
		System.out.println("全要素の合計は" + dblSum + "平均は" + dblSum / nArrayNumber);

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
