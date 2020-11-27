public class ScoreBoard{
	private int numEntries = 0;
	private GameEntry[] board;
	public ScoreBoard(int n){
		board = new GameEntry[n];
	}
	public void add(GameEntry e){
		int newScore = e.getScore();
		if(numEntries<board.length || newScore > board[numEntries-1].getScore()){
			if(numEntries<board.length)
				numEntries++;
			int count = numEntries - 1;
			while(count > 0 && newScore > board[count-1].getScore()){
				board[count] = board[count-1];
				count--;
			}
			board[count] = e;
		}
	}
	
	public GameEntry remove(int i) throws IndexOutOfBoundsException{
		if(i<0 || i>numEntries-1)
			throw new IndexOutOfBoundsException("Error!!!");
		GameEntry temp = board[i];
		for(int j=i ; j < numEntries-1 ; j++){
			board[j] = board[j+1];
		}
		board[numEntries-1] = null;
		numEntries--;
		return temp;
	}
	
	public String toString(){
		StringBuilder s = new StringBuilder("[");
		for(int i=0 ; i<numEntries ; i++){
			if(numEntries == 0)
				s.append(board[i]);
			else
				s.append("," + board[i]);	
		}
		s.append("]");
		return s.toString();
	}
}	
