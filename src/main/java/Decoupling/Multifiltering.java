package Decoupling;

public class Multifiltering implements Filter
{
        public String[] getRecommendations(String movie)
        {
                return new String[]{"Ice age","Toy story"};
        }
}