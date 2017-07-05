/* 演習10-02
 * クラスIdを識別番号の間隔をメソッドによって変更できるように変更
 * 作成日：7月5日
 * 作成者：成田修之
 */


package e_10_02;

import java.util.Scanner;

public class ExIdTester {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);

		//識別番号aを作成
		ExId exidA = new ExId();
		//識別番号bを作成
		ExId exidB = new ExId();

		//aの識別番号を表示
		System.out.println("aの識別番号：" + exidA.getId());
		//bの識別番号を表示
		System.out.println("bの識別番号：" + exidB.getId());

		System.out.print("識別番号の間隔を変更します。いくつにしますか：");
		ExId.setInterval(stdIn.nextInt());

		//識別番号cを作成
		ExId exidC = new ExId();
		//識別番号dを作成
		ExId exidD = new ExId();

		//cの識別番号を表示
		System.out.println("cの識別番号：" + exidC.getId());
		//dの識別番号を表示
		System.out.println("dの識別番号：" + exidD.getId());


		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
