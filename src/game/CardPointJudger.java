package game;

import java.util.List;

/**
 * カードのポイント判定
 */
public class CardPointJudger {

	/**
	 * カードリスト
	 */
	private List<Card> cardList;

	/**
	 * コンストラクタ
	 *
	 * @param cardList
	 */
	public CardPointJudger(List<Card> cardList) {
		this.cardList = cardList;
	}

	/**
	 * カードの役判定
	 */
	public void judge() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("役判定！");
	}

}
