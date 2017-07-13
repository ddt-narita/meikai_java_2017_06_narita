/* 演習12-02
 * 定期預金付き銀行口座クラス型変数のa,bの普通預金と定期預金残高の合計額を比較した結果を返却するメソッドを作成
 * 作成日：7月13日
 * 作成者：成田修之
 */

package e_12_02;

public class AccountTester {

	//預金総額を求めるメソッド
	static long getAllBalance(Account a) {
		//合計預金総額を求める変数
		long lngAllBalance = 0L;
		//引数が定期預金付き口座クラスの時
		if(a instanceof TimeAccount) {
			//合計に普通預金残高と定期預金残高を合わせて代入
			lngAllBalance += a.getBalance() + ((TimeAccount) a).getTimeBalance();
		//引数がそれ以外の口座クラスの時
		} else {
			//普通預金残高を代入
			lngAllBalance += a.getBalance();
		}

		//求めた預金総額を返却する
		return lngAllBalance;
	}

	//引数の2つの口座の預金総残高を比べるメソッド
	static int compBalance(Account a, Account b) {

		//返却に使う変数残高が同じときは0を返すように0で初期化
		int nReturn = 0;

		//引数aについての預金総残高を代入
		long lngAllBalanceA = getAllBalance(a);
		//引数bについての預金総残高を代入
		long lngAllBalanceB = getAllBalance(b);

		//aのほうが多いとき
		if(lngAllBalanceA > lngAllBalanceB) {
			//1を返却するようにする
			nReturn = 1;
		//bのほうが多いとき
		} else if(lngAllBalanceA < lngAllBalanceB) {
			//-1を返却するようにする
			nReturn = -1;
		}

		//比較の結果を返却する
		return nReturn;
	}

	public static void main(String[] args) {

		//定期預金付き口座クラスのインスタンスnarita
		TimeAccount narita = new TimeAccount("narita", "12345678", 1000, 500);
		//定期預金付き口座クラスのインスタンスnaoyuki
		TimeAccount naoyuki = new TimeAccount("naoyuki", "87654321", 2000, 1000);
		//普通預金口座クラスのインスタンスbouyou
		Account bouyou = new Account("bouyou", "12344321", 2000);

		//naritaとnaoyukiで預金総残高を比較
		System.out.println("naritaさんとnaoyukiさんでは");
		//比較した結果に応じて分岐
		switch(compBalance(narita,naoyuki)){
		//後者のほうが多いとき
		case -1: System.out.println("naoyukiさんのほうが預金総額は多いです。"); break;
		//前者のほうが多いとき
		case 1:  System.out.println("naritaさんのほうが預金総額は多いです。"); break;
		//同じ値の時
		case 0:  System.out.println("預金総額は同じです。"); break;
		}
		//比較の対象が変わったので一段開ける
		System.out.println();

		//naoyukiとbouyouで預金総残高を比較
		System.out.println("naoyukiさんとshibataさんでは");
		//比較の結果に応じて分岐
		switch(compBalance(naoyuki, bouyou)) {
		//後者のほうが多いとき
		case -1: System.out.println("bouyouさんのほうが預金総額は多いです。"); break;
		//前者のほうが多いとき
		case 1:  System.out.println("naoyukiさんのほうが預金総額は多いです。"); break;
		//同じ値の時
		case 0:  System.out.println("預金総額は同じです。"); break;
		}

	}

}
