/* 演習10-04
 * 日付クラスの改良
 * 作成日：7月6日
 * 作成者：成田修之
 */

package e_10_04;

import java.util.Scanner;

public class DateTester {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//デフォルトコンストラクタで今日の日付でインスタンスを作成
		Date n = new Date();
		//今日の日付を表示
		System.out.println("今日の日付" + n);
		//メソッドpreviousDate()を使って前日の日付を表示
		System.out.println("昨日の日付" + n.previousDate());
		//メソッドpreviousDate()を使って明日の日付を表示
		System.out.println("明日の日付" + n.followingDate());

		//何日前後の日付を表示したいか入力を促す
		System.out.print("何日前後：");
		//何日前後か入力
		int nBeforeAfterNumber = stdIn.nextInt();

		//入力された値分前の日付を表示
		System.out.println(nBeforeAfterNumber + "日前の日付" + new Date(n.nAfter(nBeforeAfterNumber)));
		//入力された値分後の日付を表示
		System.out.println(nBeforeAfterNumber + "日後の日付" + new Date(n.nBefore(nBeforeAfterNumber)));

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
