package game;

import java.util.ArrayList;
import java.util.List;

import common.NumberUtil;
import constant.Constant;

/**
 * カード管理
 */
public class CardManager {

	private static final int PIC_VAL = 4;
	private static final int NUM_VAL = 13;
	private List<Card> cardList;

	/**
	 * コンストラクタ
	 */
	public CardManager() {
		this.cardList = new ArrayList<Card>();
		createCardList();
		shuffle();
	}

	/**
	 * シャッフルする
	 */
	public void shuffle() {
		Card temp = null;
		for (int i = 0; i < 1000; i++) {
			int from = NumberUtil.getRndNo(PIC_VAL * NUM_VAL - 1);
			int to = NumberUtil.getRndNo(PIC_VAL * NUM_VAL - 1);
			temp = this.cardList.get(from);
			this.cardList.set(from, this.cardList.get(to));
			this.cardList.set(to, temp);
		}

	}

	/**
	 * カードリストを作成する
	 */
	public void createCardList() {
		Card card = null;
		this.cardList = new ArrayList<Card>();

		for (int i = 1; i <= PIC_VAL; i++) {
			for (int j = 1; j <= NUM_VAL; j++) {
				card = new Card();
				card.pic = i;
				card.num = j;
				if (i == Constant.D) {
					card.picStr = Constant.D_STR;
				} else if (i == Constant.H) {
					card.picStr = Constant.D_STR;
				} else if (i == Constant.S) {
					card.picStr = Constant.S_STR;
				} else if (i == Constant.C) {
					card.picStr = Constant.C_STR;
				} else {
				}
				card.numStr = Integer.toString(j);

				this.cardList.add(card);
			}
		}

	}

	/**
	 * カードを1枚ひく
	 *
	 * @return
	 */
	public Card getOneCard() {
		int i = NumberUtil.getRndNo(this.cardList.size()) - 1;
		Card card = this.cardList.get(i);
		this.cardList.remove(i);
		return card;
	}

	/**
	 * カードを5枚ひく
	 *
	 * @return
	 */
	public List<Card> get5CardList() {
		List<Card> cardList = new ArrayList<Card>();
		for (int i = 0; i < 5; i++) {
			cardList.add(this.cardList.get(i));
		}
		return cardList;
	}
}
