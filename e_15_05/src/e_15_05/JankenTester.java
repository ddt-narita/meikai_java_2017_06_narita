/* 演習15-05
 * 3人で行うじゃんけんプログラムを作成する
 * 作成日：7月14日
 * 作成者：成田修之
 */

package e_15_05;

import java.util.Scanner;

public class JankenTester {

	public static void main(String[] args) {

		//標準出力ストリームのインスタンスを生成する
		Scanner stdIn = new Scanner(System.in);

		int winnerStatus = 0;		//勝者をビット管理する変数
		int sum = 0;				//3人の手の合計を保存する変数

		//判定に使う変数群
		final int DRAW = 0;		//あいこ
		final int LOSE = 1;		//負け
		final int WIN = 2;			//勝ち

		//各プレーヤー名
		String[] player = {"com1", "com2", "you",};

		//コンピュータープレイヤー1を作成
		JankenPlayer com1 = new ComputerPlayer();
		//コンピュータープレイヤー2を作成
		JankenPlayer com2 = new ComputerPlayer();

		//出す手を選んで入力を促す
		System.out.print("じゃんけんポン1…グー/2…チョキ/3…パー：");
		//出す手を入力
		int nHand = stdIn.nextInt();

		//入力された手で人間プレーヤーを作成
		JankenPlayer you = new HumanPlayer(nHand);

		//それぞれの出した手を表示
		System.out.println("com1：" + com1);
		System.out.println("com2：" + com2);
		System.out.println("you ：" + you );

		//コンピューター1対コンピューター2の結果
		int com1vscom2 = (com1.gethand() - com2.gethand() + 3) % 3;
		//コンピューター1対利用者の入力した手の結果
		int com1vsyou = (com1.gethand() - you.gethand() + 3) % 3;
		//コンピューター2対利用者の結果
		int com2vsyou = (com2.gethand() - you.gethand() + 3) % 3;

		//勝者管理の何ビット目かを表す変数群
		final int COM1 = 0;	//コンピューター1
		final int COM2 = 1;	//コンピューター2
		final int YOU = 2;		//あなた

		//3人のプレーヤーの出した手の合計
		sum = com1.gethand() + com2.gethand() + you.gethand();

		//すべて一緒（3，6，9）かすべて違う（6）時
		if(sum == 3 || sum == 6 || sum == 9) {
			//あいこであることを表示
			System.out.println("あいこです。");
		//あいこではないとき
		} else {
			//コンピューター1と2の勝敗で分岐
			switch(com1vscom2) {

			//あいこの時
			case DRAW:
				//コンピューター2とあなたでコンピューター2の勝ちのとき
				if(com2vsyou == WIN) {
					//コンピューター1と2を勝利したプレーヤーとして保管
					winnerStatus += (1<< COM1) + (1 << COM2);
				//負けの時
				} else {
					//あなたを勝利プレーヤーとして保管
					winnerStatus += 1 << YOU;
				}
				break;

			//負けの時
			case LOSE:
				//コンピューター2とあなたであいこの時
				if(com2vsyou == DRAW) {
					//コンピューター2とあなたを勝利者として保管
					winnerStatus += (1 << COM2) + (1 << YOU);
				//勝ちの時
				} else {
					//コンピューター2を勝利者として保管
					winnerStatus += (1 << COM2);
				}
				break;

			//勝ちの時
			case WIN:
				//コンピューター1とあなたでコンピューター1の価値の時
				if(com1vsyou == WIN) {
					//コンピューター1を勝利者として保管
					winnerStatus += (1 << COM1);
				//あいこの時
				} else {
					//コンピューター1とあなたを勝利者として保管
					winnerStatus += (1 << COM1) + (1 << YOU);
				}
				break;
			}

			//勝ったプレーヤーを表示する
			System.out.println("勝ったのは");
			//3人分繰り返す
			for(int i = 0; i < 3; i++) {
				//保管してあるプレーヤーのビットが立っていれば
				if((winnerStatus >>> i & 1) == 1) {
					//その人の名前を表示
					System.out.println(player[i]);
				}
			}
			System.out.println("です。");
		}

		//標準出力ストリームをクローズ
		stdIn.close();
	}

}
