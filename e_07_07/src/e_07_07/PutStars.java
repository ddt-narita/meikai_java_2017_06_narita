/* 演習07-07
 * nこの＊を連続表示するメソッドを内部でメソッドputCharsを呼び出すことによって表示を行うように書き換えたプログラムの作成
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_07_07;

import java.util.Scanner;

public class PutStars {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//左下直角の三角形を表示することを明示
		System.out.println("左下直角の三角形を表示します。");
		//三角形の段数の入力を促す
		System.out.print("段数は：");
		//段数を入力する
		int n = stdIn.nextInt();

		//入力された段数分繰り返す
		for(int i = 1; i <= n; i++) {
			//メソッドputStarsでその段数分の＊を表示する
			putStars(i);
			//1段ごとに改行する
			System.out.println();
		}

		//標準出力ストリームをクローズする
		stdIn.close();
	}

	//引数分＊を表示するメソッド
	static void putStars(int n) {
		//メソッドputCharsを呼び出して引数分＊を表示
		putChars('*', n);
	}

	//引数の文字を第2引数分表示するメソッド
	static void putChars(char c, int n) {
		//第2引数の値だけ繰り返す
		while(n-- > 0) {
			//引数の文字を表示する
			System.out.print(c);
		}
	}
}
