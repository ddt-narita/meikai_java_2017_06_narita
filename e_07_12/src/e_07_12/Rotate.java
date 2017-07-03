/* 演習07-12
 * 整数xを右回転、左開店した値を返却するメソッドをそれぞれ作成
 */

package e_07_12;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成
		Scanner stdIn = new Scanner(System.in);

		//回転したい整数値の入力を促す
		System.out.print("整数値：");
		//回転させたい整数値を入力
		int nInput = stdIn.nextInt();
		//入力された整数値のビット構成を表示
		System.out.print("ビット構成：");
		//メソッドprintBitsを使ってビット構成を表示
		printBits(nInput);
		//ビット構成を表示した後改行する
		System.out.println();

		//何ビット回転するか入力を促す
		System.out.print("何ビット回転しますか：");
		//何ビットか入力する
		int nRotate = stdIn.nextInt();

		//右に入力された値分回転した値を入力
		int nInputR = rRotate(nInput, nRotate);
		//回転後の値を表示
		System.out.println("右に" + nRotate + "ビット回転した値は" + nInputR + "です。");
		//回転後の値のビット構成を表示
		System.out.print("ビット構成：");
		//メソッドprintBitsを使って開店後のビット構成を表示
		printBits(nInputR);
		//ビット構成を表示した後改行する
		System.out.println();

		//左に入力された値分回転した値を入力
		int nInputL = lRotate(nInput, nRotate);
		//回転後の値を表示
		System.out.println("左に" + nRotate + "ビット回転した値は" + nInputL + "です。");
		//回転後の値のビット構成を表示
		System.out.print("ビット構成：");
		//メソッドprintBitsを使って開店後のビット構成を表示
		printBits(nInputL);
		//ビット構成を表示したあと改行する
		System.out.println();

		//標準出力ストリームをクローズ
		stdIn.close();
	}

	//右回転するメソッド
	static int rRotate(int x, int n) {
		//返却する回転後の値
		int nReturn = 0;

		//右に回転したのと同じになるようなシフトで代入する
		nReturn = (x >>> n) + (x << 32 - n);

		//求めた回転後の値を返却する
		return nReturn;
	}

	//左開店するメソッド
	static int lRotate(int x, int n) {
		//返却する回転後の値
		int nReturn = 0;

		//右と逆で左に回転した後の値と同じになるようなシフトをして代入する
		nReturn = (x << n) + (x >>> 32 - n);

		//求めた回転後の値を返却する
		return nReturn;
	}

	//ビット構成を表示するメソッド
	static void printBits(int x) {
		//ビット数分繰り返す
		for(int i = 31; i >= 0; i--) {
			//1との論理積で1があるかどうか調べてあるなら1、ないなら0を表示する。
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
}
