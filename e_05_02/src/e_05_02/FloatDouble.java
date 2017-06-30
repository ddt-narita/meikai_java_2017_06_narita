/* 演習05-02
 * float型の変数とdouble型の変数に値を読み込んで表示するプログラムを作成する
 * 作成日：6月30日
 * 作成者：成田修之
 */

package e_05_02;

import java.util.Scanner;

public class FloatDouble {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//それぞれの変数の型を明示
		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		//float型変数xに入力をうながす
		System.out.print("変数x：");
		//float型変数に入力
		float fInputX = stdIn.nextFloat();

		//double型変数yに入力を促す
		System.out.print("変数y：");
		//double型変数に入力
		double dblInputY = stdIn.nextDouble();

		//入力されたfloat型変数を表示
		System.out.println("x = " + fInputX);
		//入力されたdouble型変数を表示
		System.out.println("y = " + dblInputY);

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
