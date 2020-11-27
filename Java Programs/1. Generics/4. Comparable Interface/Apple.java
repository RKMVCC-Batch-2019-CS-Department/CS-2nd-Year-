//Comparable Interface
public class Apple<T extends Number> implements Comparable<Apple>{
	T weight;
	
	Apple(T  weight){
		this.weight = weight;
	} 
	
	@Override
	public int compareTo(Apple ob){
		return Integer.compare(this.weight.intValue(), ob.weight.intValue());
	}
}
