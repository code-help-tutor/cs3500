WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package cs3500.klondike.model.hw04;

import cs3500.klondike.model.hw02.KlondikeModel;
import cs3500.klondike.model.hw02.Card;

import java.util.List;

/**
 * This is a stub implementation of the {@link cs3500.klondike.model.hw02.KlondikeModel} interface.
 * You may assume that the actual implementation of WhiteheadKlondike will have a zero-argument
 * (i.e. default) constructor, and that all the methods below will be implemented.  You may not make
 * any other assumptions about the implementation of this class (e.g. what fields it might have,
 * or helper methods, etc.).
 */
public class WhiteheadKlondike implements KlondikeModel {
  public WhiteheadKlondike() {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }
  @Override
  public List<Card> getDeck() {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }

  @Override
  public void startGame(List<Card> deck, boolean shuffle, int numPiles, int numDraw) throws IllegalArgumentException {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }

  @Override
  public void movePile(int srcPile, int numCards, int destPile) throws IllegalStateException {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }

  @Override
  public void moveDraw(int destPile) throws IllegalStateException {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }

  @Override
  public void moveToFoundation(int srcPile, int foundationPile) throws IllegalStateException {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }

  @Override
  public void moveDrawToFoundation(int foundationPile) throws IllegalStateException {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }

  @Override
  public void discardDraw() throws IllegalStateException {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }

  @Override
  public int getNumRows() {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }

  @Override
  public int getNumPiles() {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }

  @Override
  public int getNumDraw() {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }

  @Override
  public boolean isGameOver() throws IllegalStateException {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }

  @Override
  public int getScore() throws IllegalStateException {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }

  @Override
  public int getPileHeight(int pileNum) throws IllegalStateException {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }

  @Override
  public Card getCardAt(int pileNum, int card) throws IllegalStateException {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }

  @Override
  public boolean isCardVisible(int pileNum, int card) throws IllegalStateException {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }

  @Override
  public Card getCardAt(int foundationPile) throws IllegalStateException {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }

  @Override
  public List<Card> getDrawCards() throws IllegalStateException {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }

  @Override
  public int getNumFoundations() throws IllegalStateException {
    throw new RuntimeException("If you got this to run, your tests compile correctly against the data definitions.");
  }
}
