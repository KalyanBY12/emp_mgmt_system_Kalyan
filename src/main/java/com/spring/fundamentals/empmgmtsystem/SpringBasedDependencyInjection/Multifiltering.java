package com.spring.fundamentals.empmgmtsystem.SpringBasedDependencyInjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

// All anotations

@Qualifier("MF")

public class Multifiltering implements Filter
{
        public String[] getRecommendations(String movie)
        {
                return new String[]{"Ice age","Toy story"};
        }
}