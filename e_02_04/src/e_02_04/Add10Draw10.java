/* 演習02-04
 * キーボードから読み込んだ値に10加えた値と10減らした値を表示
 * 作成日：6月27日
 * 作成者：成田修之
 */


package e_02_04;

//入力に使うスキャナクラスのインポート
import java.util.Scanner;

//入力された値に10加えた値と10減らした値を表示するクラス
public class Add10Draw10 {
	//メインメソッド
	public static void main(String[] args) {
		//キーボードからの入力に使う標準出力ストリーム
		Scanner stdIn = new Scanner(System.in);
		//整数値の入力を促す
		System.out.print("整数値：");
		//整数型変数をキーボードから入力した値で初期化
		int nInput = stdIn.nextInt();

		//入力された値に10加えた値を表示
		System.out.println("10加えた値は：" + (nInput + 10));
		//入力された値から10減らした値を表示
		System.out.println("10減じた値は：" + (nInput - 10));

		//出力ストリームをクローズ
		stdIn.close();
	}

}
