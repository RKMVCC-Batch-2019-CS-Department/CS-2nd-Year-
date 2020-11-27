class The{
	public static void main(String[] args){
		Integer inum = 10;
		Number num;
		num = inum;		//Widening
		System.out.println(num);
		Integer inum2;
		inum2 = (Integer)num;	//Narrowing
		System.out.println(inum2);
		Double dnum = 20.4;
		num = dnum;	//Widening
		System.out.println(num);
		//inum2 = (Integer)num; (wrong ClassCastException)
		if(num instanceof Integer)
			inum2 = (Integer)num;	//Narrowing does not happen
		else
			System.out.println("Casting not allowed");
		System.out.println(inum2);
	
	}
}
