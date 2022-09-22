package TightCoupling;

import Decoupling.Filter;

// This is my first comment for testing purpose

public class ContentFiltering implements Filter {
    public String[] getRecommendations(String movie)
    {
        return new String[]{"Avengers","Italian Job","Mission Impossible"};
    }
}