package Arrays;


import java.util.ArrayList;
import java.util.List;

public class TestSearch {
    /*
     * Prepare test data : For every input we should have expected search results.
     * For input nut free chocolate
     * We should have the search results .
     * Search results : 10 values with first 2 search results correct i.e chocolate which doesn't have nuts in ingredients with fix.
     *                   Without fix search result will have nut free chocolate at 8 th and 9th position.
     * Test criteria: position value will have summation of position of correct search results i.e the index value for  nut free chocolates in search result.
     * Test categories: Green :0<Position <=3
     *                 Position=1 i.e 0+1.
     *                 Search optimised i.e nut free chocolates are the first 2 results of the search list.
     *                 Orange: 3<position<=6
     *                 Red:   Position>6
     *
     *
     *
     * Can use data providers in Test ng for different set of inputs and the border line for Green , red and Orange zone
     *
     *
     *

     */

//    @Test(description = "Test Search functionality ", dataProvider = "searchDataProvider")
    public void testSearchByParam(String input, int greenZoneHigherLimit, int orangeZoneHigherLimit) {

        int position = 0;
        int searchResultCount = 0;
        SearchResult result = new SearchResult();
        List<SearchResult> results = result.getSearchResult(input);

        for (int i = 0; i < results.size(); i++) {
            if (results.get(i).getDescription().contains("input"))  //or any predicate for my searched string
                searchResultCount++;
            position = position + i;
        }

        System.out.println("Search Percentage:" + searchResultCount / results.size());
        System.out.println("Search position sum" + position);
        if (position <= greenZoneHigherLimit)
            System.out.println("Search is in green Zone for " + input);

        if (position > greenZoneHigherLimit && position <= orangeZoneHigherLimit)
            System.out.println("Search is in orange Zone for " + input);

        else
            System.out.println("Search is in red Zone for " + input);
    }



  //  @DataProvider(name="searchDataProvider")
    public Object[][] searchDataProvider(){
        //Data provider for input values with border lines for green , orange and red zone
        return  new Object[][]{
                {"milk",5,8},
                {"skimmed milk",4,7},
                {"nut free chocolate",3,6},
                {"collar less shirt",4,8}

        };
    }
}



class SearchResult{


  public ArrayList getSearchResult(String input){
        return new ArrayList();
    }

    public String getDescription(){
      return "des";
    }
}