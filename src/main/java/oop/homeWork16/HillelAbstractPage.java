package oop.homeWork16;

import java.util.ArrayList;
import java.util.List;

public abstract class HillelAbstractPage {

    private String courses;
    private String additionalCourses;
    private String opportunities;
    private String category;

    public List<String> getCourses(){
        List<String> coursesNames = new ArrayList<>();
        return coursesNames;
    }

    public List<String> getAdditionalCourses(){
        List<String> additionalCourses = new ArrayList<>();
        return additionalCourses;

    }


    public List<String> getOpportunities(){
        List<String> opportunitiesNames = new ArrayList<>();
        return opportunitiesNames;

    }

    public String goToCategory (String category){
        return category;

    }

}
