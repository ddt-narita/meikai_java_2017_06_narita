/* 演習09-05
 * 開始日と終了日とから構成される期間を表すクラスの作成
 * 作成日：7月5日
 * 作成者：成田修之
 */

package e_09_05;

public class Period {

	//開始日のフィールド
	private Day from;
	//終了日のフィールド
	private Day to;

	//コンストラクタ
	Period(Day from, Day to) {
		//引数の日付クラスで開始日を初期化
		this.from = from;
		//引数の日付クラスで終了日を初期化
		this.to = to;
	}

	//開始日を返却するメソッド
	Day getStart() {
		return from;
	}

	//終了日を返却するメソッド
	Day getEnd() {
		return to;
	}

	//文字列表現を返却するメソッド
	public String toString() {
		//文字列にして返却する
		return String.format("開始日：" + from + "\n終了日：" + to + "\n");
	}

}
