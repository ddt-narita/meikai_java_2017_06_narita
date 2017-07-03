/* 演習07-16
 * 配列の最小値を求めるメソッドの作成
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_07_16;

import java.util.Scanner;

public class Min {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//生徒の人数の入力を促す
		System.out.print("生徒の人数：");
		//生徒数を入力
		int nStudentNumber = stdIn.nextInt();
		//入力された生徒数の生徒たちの点数を格納する配列をとる
		int[] tensuu = new int[nStudentNumber];

		//生徒の数だけ繰り返す
		for(int i = 0; i < nStudentNumber; i++) {

			//各生徒の点数の入力を促す
			System.out.print(i + 1 + "番目の生徒の点数：");
			//点数を格納する配列に点数を入力
			tensuu[i] = stdIn.nextInt();
		}

		//メソッドminOfを使って入力された全生徒の最低点を表示する
		System.out.print("全生徒の最低点は" + minOf(tensuu) + "点です。");

		//標準出力ストリームをクローズ
		stdIn.close();

	}


	//配列の最小値を返却するメソッド
	static int minOf(int[] a) {
		//返却する配列の最小値を格納する変数。初めは先頭の値で初期化
		int min = a[0];
		//配列の要素数分だけ繰り返す
		for(int i = 1; i < a.length; i++) {
			//ある要素がその時点までの最小値より小さければ
			if(a[i] < min) {
				//最小値をその値に更新する
				min = a[i];
			}
		}

		//最終的な最小値を返却する
		return min;
	}
}
