package GenericPages;

import java.util.ArrayList;
import java.util.List;

public class Page<I> {
	
	 private List<I> items;
	    private final int pageCapacity;
	 
	    public Page(List<I> items,int capacity){
	        this.pageCapacity = capacity;
	        this.items=new ArrayList<I>();
	        for (I i : items) {
	            add(i);
	        }

}
	    
	    public void add(I item){
	        if(isPageFull()) return;
	        items.add(item);
	    }
	 
	    public boolean isPageFull(){
	        return items.size()==pageCapacity;
	    }
	 
	    public boolean contains(I Item){
	        return items.contains(Item);
	    }
	 
	    public int getPageSize(){
	        return items.size();
	    }
	 
	 
	}
