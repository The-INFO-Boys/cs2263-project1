package edu.isu.cs.cs2263;

public interface StockIterator {

    /**
     * This is a java interface for the stock iterator.
     */

    /**
     * nextStock gets the next stock in the array
     * @return
     */
    Stock nextStock();

    /**
     * hasMoreStock is a boolean that checks that the array has more stock.
     * @return
     */
    Boolean hasMoreStock();
}
