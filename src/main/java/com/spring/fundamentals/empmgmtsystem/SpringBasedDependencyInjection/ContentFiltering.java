package com.spring.fundamentals.empmgmtsystem.SpringBasedDependencyInjection;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
// All anotations
@Qualifier("CF")

public class ContentFiltering implements Filter
{
    public String[] getRecommendations(String movie)
    {
        return new String[]{"Italaian Job","Missiion Impossible","M13"};
    }

}
