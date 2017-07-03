/* 演習07-01
 * 受け取ったint型引数の値が負であれば-1、0であれば0、正であれば1を返却するメソッドの作成
 * 作成日：7月3日
 * 作成者：成田修之
 */

package e_07_01;

import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//判定したい数値の入力を促す
		System.out.print("正負を判定します。数値を入力してください：");

		//判定したい値を入力
		int nInput = stdIn.nextInt();

		//メソッドsignOfを呼び出して返却された値によって分岐
		switch(signOf(nInput)) {
		//-1がかえって来た時その値は負であることを表示
		case -1: System.out.println("その値は負です。"); break;
		//０が返ってきたときは入力された値が0であることを表示
		case 0: System.out.println("その値は0です。"); break;
		//1が返却されたときは入力された値が正であることを表示
		case 1: System.out.println("その値は正です。"); break;
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

	//引数の符号を判定する関数
	static int signOf(int n) {

		//返却に使う変数を1で初期化
		int nReturn = 1;
		//引数で受け取った値が0未満の時
		if(n < 0) {
			//返却に使う変数に-1を代入
			nReturn = -1;
		}

		//引数に受け取った値が0の時
		if(n == 0) {
			//返却に使う変数に0を代入
			nReturn = 0;
		}

		//引数を判定して返却
		return nReturn;
	}

}
