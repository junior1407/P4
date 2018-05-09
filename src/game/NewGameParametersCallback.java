package game;


public interface NewGameParametersCallback {
	/**
	 * method to accept new game parameters
	 * 
	 * @param cols number of colums of boxes in new game
	 * @param rows number of rows of boxes in new game
	 */
	public void newGameParameters(int cols, int rows);
}