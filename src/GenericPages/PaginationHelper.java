package GenericPages;

import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class PaginationHelper<I> {
	
	private int itemCount;
    private int pageCount;
    private List<Page> pages;
    private List<I> data;

    
    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        super();
        setItemCount(collection.size());
        setData(collection);
        fillPages();
        setPageCount(pages.size());
    }
    
    
    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return itemCount;
    }
   
    private void setItemCount(final int itemCount){
        this.itemCount=itemCount;
    }
   
    /**
     * returns the number of pages
     */
    public int pageCount() {
        return pageCount;
    }
   
    private void setPageCount(int pageCount){
        this.pageCount=pageCount;
    }
   
    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if(pageIndex>=pages.size() || pageIndex < 0) return -1;
        return pages.get(pageIndex).getPageSize();
    }
   
    public List<I> getData(){
        return data;
    }
   
    private void setData(List<I> collection){
        if(data==null) data=new ArrayList<I>();
        data.addAll(collection);
    }
   
    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if(itemIndex >= data.size() || itemIndex < 0) return -1;
        for (Page<I> page : pages) {
          if(page.contains(data.get(itemIndex))){
              return pages.indexOf(page);
          }
        }
        return -1;
    }
   
    private void fillPages(){
        pages = new ArrayList<Page>();
        int index=0;
        while(index< data.size()) {
            int toIndex = index+pageCount>=data.size()?data.size():(index+pageCount);
            pages.add(new Page<I>(data.subList(index, toIndex), pageCount));
            index=toIndex;
        }
    }
    
    


}
