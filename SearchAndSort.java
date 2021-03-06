/**
 * The purpose of this class is to sort or search a given array.
 * <p>
 * @author David Yeghshatan 
 * @version Version 1 May 22
 */ 

public class SearchAndSort
{
  public SearchAndSort ()
  {}
  
  /**
   * This method uses bubble sort to sort the inputted String array.
   * 
   * @param sortedList Holds the sorted array.
   * @param temp Temporary variable used for the sort..
   * @param theOrder [] (int) An array that holds the order of the indices
   * @param temp2 Temporary variable used for the sort.
   * @param original Holds the original values of the array.
   * @return the ordered indexes.
   */ 
  public int [] bubbleSort (String [] sortedList)
  {
    String temp = "";
    int temp2 = 0;
    int theOrder [] = new int [BookRecord.recNum];
    
    for (int i = 0 ; i< BookRecord.recNum; i++) 
      theOrder [i]=i;
    
    for (int i = 0 ; i< BookRecord.recNum-1 ; i++) 
    {
      for (int j = i+1 ; j< BookRecord.recNum ; j++) 
      {
        if (sortedList[i].compareTo(sortedList[j]) > 0) 
        {
          temp = sortedList [ j ];
          sortedList [j] = sortedList [ i ];
          sortedList [i] = temp;
          temp2 = theOrder [j];
          theOrder [j] = theOrder[i];
          theOrder [i] = temp2;
        }
      }
    }
    return theOrder;
  }
  
  /**
   * This method uses a sequential sarch to return the index of found text.
   * 
   * @param searchIndex this variable holds the index of found text
   * @param counter this variable is used to keep track of indecies
   * @return the ordered indexes.
   */ 
  public int [] sequentialSearch (String [] original, String search)
  {
    int [] searchIndex = new int [original.length];
    int counter = 0;
    for (int x = 0; x < original.length; x++)
    {
      if ((original [x]).equals (search))
      {
        searchIndex [counter]=x;
        counter++;
      }
    }
    for (int x = counter; x<original.length; x++)
      searchIndex [x]= -1;
    
    return searchIndex;
  }
}
