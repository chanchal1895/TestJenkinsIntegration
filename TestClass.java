class Game{
  public void play() {
    System.out.println("Playing...");
  }
}

public class TestClass extends Game{
  
   public static void main(String[] args){
	   
	   new Game().play();
   }
   
   
}