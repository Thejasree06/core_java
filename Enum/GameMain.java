class GameMain
{
	public static void main(String[] main)
	{
		
		
		
		
		System.out.println("=============");
		
		Game game;
		game=new Game();
		game.play();
		game.pause();
		game.end();
		game.showInfo();
		
		Player player;
		player=new Player();
		player.playGame(game);
		player.pauseGame(game);
		player.endGame(game);
		player.showInfo();
		
		
	}
}