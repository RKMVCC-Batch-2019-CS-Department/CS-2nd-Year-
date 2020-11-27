public class Game{
	public static void main(String[] args){
		String name[] = new String[]{"Messi", "Ronaldo", "Neymar", 
								   "Mbappe", "Lewandowski", "Haaland",
								   "Sterling", "Werner", "Ziyech", "Havertz"};
		int score[] = new int[]{10,7,11,29,9,19,20,12,13,26};
		ScoreBoard s1 = new ScoreBoard(5);
		for(int i=0 ; i<score.length ; i++){
			GameEntry ge = new GameEntry(name[i], score[i]);
			System.out.println("Adding..." + ge);
			s1.add(ge);
		}
		System.out.println(s1);
		
		System.out.println("Removing score at index: " + 3);
		s1.remove(3);
		System.out.println(s1);
	}
}
		
			
