/* 演習07-32
 * int型以外の整数型のビット構成を表示するメソッドの作成
 * 作成日：7月4日
 * 作成者：成田修之
 */

package e_07_32;

import java.util.Scanner;

public class Bits {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//byte型整数の値を入力
		System.out.print("byte型整数：");
		byte bInput = stdIn.nextByte();
		//入力されたbyte型整数のビット構成を表示する
		System.out.println("ビット構成");
		printBits(bInput);

		//short型整数の値を入力
		System.out.print("short型整数：");
		short shrtInput = stdIn.nextShort();
		//入力されたshort型整数のビット構成を表示する
		System.out.println("ビット構成");
		printBits(shrtInput);

		//int型整数の値を入力
		System.out.print("int型整数：");
		int nInput = stdIn.nextInt();
		//入力されたint型整数のビット構成を表示する
		System.out.println("ビット構成");
		printBits(nInput);

		//long型整数の値を入力
		System.out.print("long型整数：");
		long lngInput = stdIn.nextLong();
		//入力されたlong型整数のビット構成を表示する
		System.out.println("ビット構成");
		printBits(lngInput);



		//標準出力ストリームをクローズ
		stdIn.close();
	}

	//byte型についてビット構成を表示するメソッド
	static void printBits(byte x) {
		//ビット数分繰り返す
		for(int i = 7; i >= 0; i--) {
			//一つずつビットを調べ1があれば1をなければ0を表示
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		//ビット構成を表示した後改行する
		System.out.println();
	}

	//short型についてビット構成を表示するメソッド
	static void printBits(short x) {
		//ビット数分繰り返す
		for(int i = 15; i >= 0; i--) {
			//一つずつビットを調べ1があれば1をなければ0を表示
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		//ビット構成を表示した後改行する
		System.out.println();
	}

	//int型についてビット構成を表示するメソッド
	static void printBits(int x) {
		//ビット数分繰り返す
		for(int i = 31; i >= 0; i--) {
			//一つずつビットを調べ1があれば1をなければ0を表示
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		//ビット構成を表示した後改行する
		System.out.println();
	}

	//long型についてビット構成を表示するメソッド
	static void printBits(long x) {
		//ビット数分繰り返す
		for(int i = 63; i >= 0; i--) {
			//一つずつビットを調べ1があれば1をなければ0を表示
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		//ビット構成を表示した後改行する
		System.out.println();
	}
}
