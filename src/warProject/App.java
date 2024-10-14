package warProject;

public class App {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
Deck deck = new Deck();
Player p1 = new Player();
Player p2 = new Player();

deck.shuffle();

for(int i = 0; i < 26; i++) {
  p1.getHand().add(deck.draw());
  p2.getHand().add(deck.draw());
}
for (int x = 0; x < 26; x++) {
  Card p1Draw = p1.flip();
  Card p2Draw = p2.flip();

if(p1Draw.value > p2Draw.value) {
  System.out.println("Player 1 recieved a point!");
}
else if (p2Draw.value > p1Draw.value) {
  System.out.println("Player 2 recieved a point!");
  } else {
    System.out.println("It's a tie!");
  }

if(p1.score > p2.score) {
  System.out.println("Player 1 wins!");
}
else if (p2.score > p1.score) {
  System.out.println("Player 2 wins!");
} else {
  System.out.println("It's a tie");
}
  }

  }
}
