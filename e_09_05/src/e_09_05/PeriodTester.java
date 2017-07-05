/* 演習09-05
 * 開始日と終了日とから構成される期間を表すクラスの作成
 * 作成日：7月5日
 * 作成者：成田修之
 */

package e_09_05;

import java.util.Scanner;

public class PeriodTester {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);

		//開始日の入力を促す
		System.out.println("開始日を入力してください");
		//開始日の年を入力
		System.out.print("年：");
		int startYear = stdIn.nextInt();
		//開始日の月を入力
		System.out.print("月：");
		int startMonth = stdIn.nextInt();
		//開始日の日にちを入力
		System.out.print("日：");
		int startDay = stdIn.nextInt();
		//終了日の入力を促す
		System.out.println("終了日を入力してください");
		//終了日の年を入力
		System.out.print("年：");
		int endYear = stdIn.nextInt();
		//終了日の月を入力
		System.out.print("月：");
		int endMonth = stdIn.nextInt();
		//終了日の日にちを入力
		System.out.print("日：");
		int endDay = stdIn.nextInt();

		//入力された開始日と終了日でクラスPeriodのオブジェクトを作る
		Period period = new Period(new Day(startYear, startMonth, startDay), new Day(endYear, endMonth, endDay));

		//作ったオブジェクトについて文字列表現を表示
		System.out.print(period + "\n");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
