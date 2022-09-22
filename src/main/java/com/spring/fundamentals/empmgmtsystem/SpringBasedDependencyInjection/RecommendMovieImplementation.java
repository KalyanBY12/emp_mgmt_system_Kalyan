package com.spring.fundamentals.empmgmtsystem.SpringBasedDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommendMovieImplementation
{
    @Autowired
    @Qualifier("CF")
    private Filter filter;

    /*
    public RecommendMovieImplementation(Filter filter)
    {
        super();
        this.filter = filter;
    }
    */

    public String[] recommendMovie(String movie){
        System.out.println("Checking the filter names in usage: "+ filter +"\n");
        String[] resultMovies = filter.getRecommendations("ET");
        return resultMovies;
    }
}