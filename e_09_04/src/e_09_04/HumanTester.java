/* 演習09-04
 * 人間クラスに誕生日のフィールドとtoStringメソッドを追加
 * 作成日：7月5日
 * 作成者：成田修之
 */

package e_09_04;

import java.util.Scanner;

public class HumanTester {

	public static void main(String[] args) {
		//標準出力ストリームのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);

		//情報の入力を促す表示
		System.out.println("あなたの情報を入力してください。");
		//名前を入力
		System.out.print("名前：");
		String name = stdIn.next();
		//身長を入力
		System.out.print("身長：");
		int height = stdIn.nextInt();
		//体重を入力
		System.out.print("体重：");
		int weight = stdIn.nextInt();
		//誕生日の日付の入力を促す
		System.out.println("誕生日の日付を入力してください");
		//生まれた年の入力
		System.out.print("年：");
		int year = stdIn.nextInt();
		//月の入力
		System.out.print("月：");
		int month = stdIn.nextInt();
		//日にちの入力
		System.out.print("日：");
		int day = stdIn.nextInt();

		//入力された情報でオブジェクトを作成
		Human yourData = new Human(name, height, weight, new Day(year, month, day));

		//作ったオブジェクトを文字列表現で表示
		System.out.println(yourData + "\n");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
