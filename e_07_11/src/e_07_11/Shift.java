/* 演習07-11
 * 整数を左右にシフトした値が2のべき乗での乗算や除算と等しくなることを確認するプログラムの作成
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_07_11;

import java.util.Scanner;

public class Shift {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		//シフト、べき乗する整数の入力を促す
		System.out.print("整数値：");

		//計算に使う整数を入力
		int nInput = stdIn.nextInt();

		//シフトする数の入力を促す
		System.out.print("いくつシフトしますか：");
		//シフトする数を入力する
		int nShift = stdIn.nextInt();

		//入力された整数値を入力された分だけ右にシフトした値を表示
		System.out.println("左シフト：" + (nInput << nShift));
		//入力された整数値を入力された分だけ左にシフトした値を表示
		System.out.println("右シフト：" + (nInput >> nShift));
		//入力された整数値をメソッドに入力された値を渡して返却された値でかけた値を表示（べき乗での乗算表示）
		System.out.println("2の" + nShift + "乗の乗算：" + nInput * power(nShift));
		//入力された整数値をメソッドに入力された値を渡して返却された値で割った値を表示（べき乗での除算表示）
		System.out.println("2の" + nShift + "乗の除算：" + nInput / power(nShift));

		//標準出力ストリームをクローズ
		stdIn.close();
	}


	//2の引数乗を返却するメソッド
	static int power(int n) {
		//返却する値を掛け算するので1で初期化
		int nReturn = 1;
		//引数分繰り返す
		for(int i = 0; i < n; i++) {
			//2の積の複合代入
			nReturn *= 2;
		}

		//求めた返却する値を返却
		return nReturn;
	}
}
