package TightCoupling;

import Decoupling.Filter;

public class ContentFiltering implements Filter {
    public String[] getRecommendations(String movie)
    {
        return new String[]{"Avengers","Italian Job","Mission Impossible"};
    }
}