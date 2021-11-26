package edu.isu.cs.cs2263;

public interface StockIterator {

    /**
     *
     * @return
     */

    //get the next stock in the array
    Stock nextStock();

    //Check that the array has more stock
    Boolean hasMoreStock();
}
