/* 演習02-01
 * int型に実数値を代入したときのプログラムの挙動を確認する
 * 作成日：6月27日
 * 作成者：成田修之
 */

package e_02_01;

//
public class SumAve1 {
	//
	public static void main(String[] args) {

		int x;		//実数を入力するための整数型の変数を宣言
		int y;		//実数を入力するための整数型の変数を宣言

		//int型変数xに実数を入力する
		x = 54.2;
		//int型変数yに実数を入力する
		y = 43.3;

		//xの値を表示する
		System.out.println("xの値は" + x + "です。");
		//yの値を表示する
		System.out.println("yの値は" + y + "です。");
		//xとyの合計を表示する
		System.out.println("合計は" + (x + y) + "です。");
		//xとyの平均を表示する
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}
}

/* 型の不一致：double型からint型には変換できません。という表示が出た。
 * 実数から整数への暗黙の型変換がJAVAではサポートされていないようだった
 * JAVAは強い型付けであるといわれる理由だと考えられる。
 */