package TightCoupling;

public class RecommenderImplementation
{
    public String[] recommendMovie(String movie)
    {
       ContentFiltering filter = new ContentFiltering();
       String[] filterResult = filter.getRecommendations("ET");
       return filterResult;
    }
}
