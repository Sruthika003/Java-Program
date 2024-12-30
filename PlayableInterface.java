package day7Exercixe;
interface Playable{
	void play();
}
class FootBall implements Playable{

	@Override
	public void play() {
		System.out.println("play football");
		
	}
	
}
class VolleyBall implements Playable{

	@Override
	public void play() {
		System.out.println("play Volleyball");
		
	}
	
}
class BasketBall implements Playable{

	@Override
	public void play() {
		System.out.println("play basketball");
		
	}
	
}

public class PlayableInterface {

	public static void main(String[] args) {
		FootBall obj1 = new FootBall();
		obj1.play();
		VolleyBall obj2 = new VolleyBall();
		obj2.play();
		BasketBall obj3 = new BasketBall();
		obj3.play();

	}

}
