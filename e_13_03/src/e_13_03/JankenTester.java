package e_13_03;

import java.util.Scanner;

public class JankenTester {



	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを作成
		Scanner stdIn = new Scanner(System.in);
		//出す手を選んで入力を促す
		System.out.print("1…グー/2…チョキ/3…パー：");
		//出す手を入力
		int nHand = stdIn.nextInt();
		//入力された値で人間プレーヤーのインスタンスを作成
		JankenPlayer a = new HumanPlayer(nHand);
		//選んだ出す手を表示
		System.out.println(a);
		//ランダムな手を出すコンピュータープレーヤーのインスタンスを作成
		JankenPlayer b = new ComputerPlayer();
		//出す手を表示
		System.out.println(b);

		//メソッドcompeteを使ってコンピュータープレーヤーに勝ったかどうかで分岐
		switch(compete(a,b)) {
		//返却値が1の時、勝ちであると表示
		case 1:  System.out.println("勝ちです"); break;
		//-1の時、負けであると表示
		case -1: System.out.println("負けです"); break;
		//0の時、愛子であると表示
		case 0:  System.out.println("あいこです"); break;
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

	//じゃんけんプレーヤー2人の勝敗を返却するメソッド
	public static int compete(JankenPlayer a, JankenPlayer b) {
		//返却に使う変数。以下あいこのときの処理は行わずあいこの時の0で初期化
		int nReturn = 0;
		//第一引数のプレーヤーの手で分岐
		switch(a.nHand) {
		//グーの時
		case 1:
			//第2引数のプレーヤーがチョキの時は勝ち
			if(b.nHand == 2) {
				nReturn = 1;
			//パーの時は負け
			} else if(b.nHand == 3) {
				nReturn = -1;
			}
			break;
		//チョキの時
		case 2:
			//相手がパーの時は価値
			if(b.nHand == 3) {
				nReturn = 1;
			//グーの時は負け
			} else if(b.nHand == 1) {
				nReturn = -1;
			}
			break;
		//パーの時
		case 3:
			//相手がグーの時は勝ち
			if(b.nHand == 1) {
				nReturn = 1;
			//チョキの時は負け
			} else if(b.nHand == 2) {
				nReturn = -1;
			}
			break;
		}

		//最終的な勝敗を返却する
		return nReturn;
	}

}
