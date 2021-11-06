package edu.isu.cs.cs2263;

public interface StockIterator {

    //get the next stock in the array
    StockToReplace nextStock();

    //Check that the array has more stock
    Boolean hasMoreStock();
}
