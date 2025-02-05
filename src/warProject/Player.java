package warProject;

import java.util.ArrayList;
import java.util.List;

public class Player {

  public List<Card> getHand() {
    return hand;
  }
  public void setHand(List<Card> hand) {
    this.hand = hand;
  }
  public int getScore() {
    return score;
  }
  public void setScore(int score) {
    this.score = score;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  List<Card> hand = new ArrayList<Card>();
  int score = 0;
  String name;
  
  public Card flip() {
    Card card = this.hand.remove(0);
    return card;
  }
  public void describe() {
    for (Card card : this.hand) {
      card.describe();
  }
}
  
  public void draw(Deck deck) {
  hand.add(deck.draw());
  
  }
  public void incrementScore( ) {
    score++;
  }
}

