/*演習02-10
 * 名前の姓と名を個別にキーボードから読み込んで挨拶を行うプログラムの作成
 * 作成日：6月28日
 * 作成者：成田修之
 */

package e_02_10;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンス生成
		Scanner stdIn = new Scanner(System.in);

		//苗字の入力を促す
		System.out.print("姓：");
		//キーボードから苗字読み込む
		String l_Name = stdIn.next();
		//名前の入力を促す
		System.out.print("名：");
		//キーボードから名前を読み込む
		String f_Name = stdIn.next();

		//読み込んだ名前で挨拶を表示
		System.out.println("こんにちは" + l_Name + f_Name + "さん。");

		//標準出力ストリームをクローズ
		stdIn.close();
	}
}
