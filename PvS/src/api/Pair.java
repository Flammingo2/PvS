package api;
import java.util.Objects;

public final class Pair<F extends Comparable<F>,S extends Comparable<S>> implements Comparable<Pair<F,S>> {
	
	private final F first;
	private final S second;

	public Pair(F first, S second) {
		//Initialization: final, but no deep copy possible
		this.first = first;
		this.second = second;
	}
	
	@Override
	public String toString() {
		//Give attribute values back, trying to avoid referenznumbers
		return("first: " + first.toString() + ", second: " + second.toString());
	}

	public F getFirst() {
		return first;
	}

	public S getSecond() {
		return second;
	}

	@Override
	public int hashCode() {
		return Objects.hash(first, second);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair<F,S> other = (Pair<F,S>) obj;
		return Objects.equals(first, other.first) && Objects.equals(second, other.second);
	}
	
	public int compareTo(Pair<F,S> pair){
		//call compareTo-method onto each datatype within object
		int first = this.first.compareTo(pair.first);
		int second = this.second.compareTo(pair.second);
		
		//Balance values first and second, first has more power
		if(first != 0) {
			return first;
		}else {
			return second;
		}
	}
	
	
	
	

}
