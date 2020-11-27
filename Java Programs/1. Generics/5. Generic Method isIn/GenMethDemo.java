class GenMethDemo{
	static<T extends Comparable<T>, V extends T>boolean  isIn(T x, V[] y){
		for(int i=0 ; i< y.length ; i++)
			if(x.equals(y[i])) 
			return true;
		return false;
	}
	
	public static void main(String[] args){
		Integer nums[]  = {1,2,3,4,5,6,7,8,9,10};
		if(GenMethDemo.<Integer, Integer> isIn(4, nums))	//if(isIn(4, nums))
			System.out.println("Yes");
			else
			System.out.println("No");
		String[] strs = {"one", "two", "three", "four", "five"};
		if (isIn("four",strs))
			System.out.println("four is in strs");
			else
			System.out.println("four is not in strs");
		}
}
