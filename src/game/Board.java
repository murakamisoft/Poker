package game;

import java.util.ArrayList;
import java.util.List;

/**
 * ボード
 */
public class Board {

	/**
	 * カードリスト
	 */
	private List<Card> card5List;

	/**
	 * コンストラクタ
	 */
	public Board() {
		this.card5List = new ArrayList<Card>();
	}

	/**
	 * カードリストを設定する
	 *
	 * @param card5List
	 */
	public void setCard5List(List<Card> card5List) {
		this.card5List = card5List;
	}

	/**
	 * 指定場所のカードを変更する
	 *
	 * @param index
	 * @param card
	 */
	public void changeCard(int index, Card card) {
		this.card5List.set(index, card);
	}

	/**
	 * カードリストを出力する
	 */
	public void printCard5List() {
		for (Card c : this.card5List) {
			c.printCard();
			System.out.print("\t\t\t");
		}
		System.out.println();
	}

	/**
	 * カードのステータスを出力する
	 */
	public void printCardStatusList() {
		int i = 0;
		for (Card c : this.card5List) {
			c.printStatus(++i);
			System.out.print("\t");
		}
		System.out.println();
	}

	/**
	 * 指定要素のカードの保留ステータスを変更する
	 *
	 * @param num
	 */
	public void changeStatus(int num) {
		int i = num - 1;
		this.card5List.get(i).changeStatus();
	}

	/**
	 * カードの残す配るを選択するメッセージを表示する
	 */
	public void printSelectCardStatus() {
		System.out.print("残す、配るカードを選択してください。9で勝負！\n>>");
	}
}
