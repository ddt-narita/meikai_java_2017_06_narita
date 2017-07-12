/* 演習11-01
 * クラスDateIdをパッケージId、DateIdTesterを無名パッケージに所属させるように変更
 * 作成日：7月6日
 * 作成者：成田修之
 */

package id;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;

public class DateId {
	//何番目までの識別番号を与えたか
	private static int counter;
	//識別番号
	private int id;

	//クラス初期化子
	static {
		//今日の日付を獲得
		GregorianCalendar today = new GregorianCalendar();
		//今日の日付の年を取得
		int y = today.get(YEAR);
		//今日の日付の月を取得
		int m = today.get(MONTH);
		//今日の日付の日を取得
		int d = today.get(DATE);

		//最初にクラスDateIdのインスタンスを生成した際に今日の日付を表示
		System.out.printf("今日は%4d年%2d月%2d日です。\n", y, m, d);
		//カウンターに日付を100倍にして入力
		counter = y * 1000000 + m * 10000 + d * 100;
	}

	//コンストラクタ
	public DateId() {
		//インスタンスの生成ごとにインクリメントして識別番号を与える
		id = ++counter;
	}

	//識別番号のゲッター
	public int getId() {
		//識別番号を返却する
		return id;
	}

}
