/****************************************************************************
 *
 * Created by: Jess and Craig
 * Created on: Sept 2016
 *
 ****************************************************************************/
import java.util.ArrayList;
import java.util.EmptyStackException;

public class MrCoxallStack<Item> {

	
	ArrayList<Item> al = new ArrayList<Item>();
	
	
	public void push (Item numbah) {
		
		 al.add(numbah);
		
	}
	
	public Item pop(){
		
		Item returnValue;
		
		if (al.size() == 0) {
			
			throw new EmptyStackException();
			
		} else {
		
			int lastIndex =	al.size() - 1; 
		
			returnValue = al.get(lastIndex);
		
			al.remove(lastIndex);
		
		}
		
		return returnValue;
		
	}
	
	public Item peek() {
		
		Item returnValue;
		
		if (al.size() == 0) {
			
			throw new EmptyStackException();
			
		} else {
		
			int lastIndex =	al.size() - 1; 
		
			returnValue = al.get(lastIndex);
		
		}
		
		return returnValue;
		
	}
	
	public void clear(){
		
		al.clear();
		
	}
	
}
