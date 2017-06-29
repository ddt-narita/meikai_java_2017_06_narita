/* 演習04-05
 * カウントダウンでデクリメントする式を後置減分演算子から前置減分演算子に置き換え
 * 作成日：6月29日
 * 作成者：成田修之
 */

package e_04_05;

import java.util.Scanner;

public class CountDown {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//入力された値からカウントダウンすることを明示
		System.out.print("カウントダウンします。");
		//カウントダウンする数を入力するための変数
		int nCount;

		do {
			//カウントダウンする正の整数の入力を促す
			System.out.print("正の整数値：");
			//カウントダウンする数の入力を促す
			nCount = stdIn.nextInt();
		//入力された値が正の整数でない限り繰り返す
		} while(nCount <= 0);

		//カウントダウンしていく数が0になって終わるまで繰り返す
		while(nCount >= 0) {
			//デクリメントされた値を表示する
			System.out.println(--nCount);
		}

		//標準出力ストリームをクローズ
		stdIn.close();

	}

}

/* 表示するデクリメントを後置から前置に変えたことによってカウントダウンを始める値は入力された値から-1された値で
 * 終了の値も-1と後置の場合と比べて全体的に-1されたカウントダウンになった
 */