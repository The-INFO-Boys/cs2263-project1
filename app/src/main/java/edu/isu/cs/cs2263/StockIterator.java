package edu.isu.cs.cs2263;

public interface StockIterator {

    /**
     *This is a java interface for the stock iterator.
     *The nextStock method gets the next stock in the array.
     * The hasMoreStock is a boolean, and it checks the array to see if
     * there is more stock.
     * @return
     */

    //get the next stock in the array
    Stock nextStock();

    //Check that the array has more stock
    Boolean hasMoreStock();
}
