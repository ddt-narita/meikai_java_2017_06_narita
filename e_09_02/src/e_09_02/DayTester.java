/* 演習09-02
 * 日付クラス第3版を利用するプログラムの作成。すべてのコンストラクタの働きを確認できるようにする
 * 作成日：7月5日
 * 作成者：成田修之
 */

package e_09_02;

import java.util.Scanner;

public class DayTester {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);
		
		//日付の入力を促す表示
		System.out.println("日付を入力してください");
		//年について入力する
		System.out.print("年：");
		int nYear = stdIn.nextInt();
		//月を入力
		System.out.print("月：");
		int nMonth = stdIn.nextInt();
		//日にちを入力
		System.out.print("日：");
		int nDate = stdIn.nextInt();
		
		//Day型の配列を取る
		Day[] dayArray = new Day[5];
		
		//引数を受け取らないコンストラクタでの日付を作成
		dayArray[0] = new Day();
		//引数を年だけ受け取るコンストラクタでの日付を作成
		dayArray[1] = new Day(nYear);
		//引数を年と月だけ受け取るコンストラクタでの日付を作成
		dayArray[2] = new Day(nYear, nMonth);
		//引数をすべての情報を受け取るコンストラクタでの日付を作成
		dayArray[3] = new Day(nYear, nMonth, nDate);
		//引数に同じクラスの異なるオブジェクトを受け取るコンストラクタでの日付の作成
		dayArray[4] = new Day(dayArray[2]);
		
		//配列の要素数分だけ繰り返す
		for(int i = 0; i < 5; i++) {
			//各日付要素を文字列表現で表示
			System.out.println("day" + i + "：" + dayArray[i]);
		}
		
		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
