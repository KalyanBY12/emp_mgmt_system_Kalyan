package com.spring.fundamentals.empmgmtsystem;
import Decoupling.Multifiltering;
import Decoupling.RecommendedImplementation;
import TightCoupling.ContentFiltering;
import TightCoupling.RecommenderImplementation;
import com.spring.fundamentals.empmgmtsystem.SpringBasedDependencyInjection.RecommendMovieImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class EmpMgmtSystemApplication {
	//for tight Coupling
	//Two classes are dependent on each other
	//One class has to be changed to some other resposiblity you can't really do it
//Decoupling(Loose Coupling)
	//Independent Responsiblities
	public static void main(String[] args) {

		//************** Tight Coupling
		//Two classes are dependent on each other
		//One class has to be changed to some other resposiblity you can't really do it

      RecommenderImplementation recommendations=new RecommenderImplementation();
      String[] resultMovies= recommendations.recommendMovie("ET");
      System.out.println(Arrays.toString(resultMovies));

      // SpringApplication.run(EmpMgmtSystemApplication.class, args);

		//************Decoupling(Loose Coupling)
		//Independent Responsiblities
		RecommendedImplementation recommendobj =new RecommendedImplementation(new Multifiltering());
		String[] finalResultMovies=recommendobj.recommendMovie("ET");
		System.out.println(Arrays.toString(finalResultMovies));

		//SpringApplication.run(EmpMgmtSystemApplication.class, args);

		//*************** Spring Based Automanaging Dependencies

		ApplicationContext appContextObj = SpringApplication.run(EmpMgmtSystemApplication.class,args);

		RecommendMovieImplementation recommender3 = appContextObj.getBean(RecommendMovieImplementation.class);

		String[] finalresultMovies3 = recommender3.recommendMovie("XYZ");

		System.out.println(Arrays.toString(finalresultMovies3));

	}
}
