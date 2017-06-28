/* 演習02-03
 * キーボードから読み込んだ値をそのまま反復して表示するプログラムの作成
 * 作成日：6月27日
 * 作成者：成田修之
 */

package e_02_03;

//キーボードから入力するためのスキャナクラスをインポート
import java.util.Scanner;

//入力された値をそのまま反復して返すクラス
public class Reverse {
	//メインメソッド
	public static void main(String[] arg) {
		//入力に使う標準出力ストリームを用意
		Scanner stdIn = new Scanner(System.in);
		//整数値の入力を促す
		System.out.print("整数値：");
		//整数型変数にキーボードから値を入力
		int x = stdIn.nextInt();
		//入力された値を反復して表示
		System.out.print( x +"と表示しましたね。");

		//出力ストリームをクローズ
		stdIn.close();
	}
}
