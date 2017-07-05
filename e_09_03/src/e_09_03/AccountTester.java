/* 演習09-03
 * 銀行口座クラスに口座開設日のフィールドとtoStringメソッドの追加を行う
 * 作成日：7月5日
 * 作成者：成田修之
 */

package e_09_03;

import java.util.Scanner;

public class AccountTester {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);

		//口座の情報を表示する
		System.out.println("口座の情報を入力してください");
		//口座名義の入力
		System.out.print("口座名義：");
		String name = stdIn.next();
		//口座番号を入力
		System.out.print("口座番号：");
		String no = stdIn.next();
		//預金残高を入力
		System.out.print("預金残高：");
		long nBalance = stdIn.nextLong();

		//口座開設日を入力
		System.out.println("口座開設日");
		//開設した年を入力
		System.out.print("年：");
		int nOpenYear = stdIn.nextInt();
		//開設した月を入力
		System.out.print("月：");
		int nOpenMonth = stdIn.nextInt();
		//開設した日にちを入力
		System.out.print("日：");
		int nOpenDay = stdIn.nextInt();

		//入力された情報からオブジェクトを表示
		Account myAccount = new Account(name, no, nBalance, new Day(nOpenYear, nOpenMonth, nOpenDay));

		//オブジェクトの文字列表現を表示
		System.out.print(myAccount + "\n");

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
