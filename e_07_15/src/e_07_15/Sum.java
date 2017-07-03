/* 演習07-15
 * 配列aの全要素の合計を求めるメソッドsumOfを作成
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_07_15;

import java.util.Scanner;

public class Sum {

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

		//メソッドsumOfを使って全生徒の点数の合計を表示する
		System.out.print("全生徒の合計は" + sumOf(tensuu) + "点です。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

	//配列の全要素の合計を求めるメソッド
	static int sumOf(int[] a) {
		//返却する合計を求める変数
		int nSum = 0;
		//配列の要素数分繰り返す
		for(int i = 0; i < a.length; i++) {
			//合計の変数に各要素の値を加算していく
			nSum += a[i];
		}

		//計算し終えた合計を返却する
		return nSum;
	}
}
