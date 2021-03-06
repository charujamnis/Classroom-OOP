package com.dtcc.projects;

import java.util.ArrayList;
import java.util.List;

public class DelTech {

    private static ArrayList<Instructor> instructorList=new ArrayList<>();

        static { // static initializer
            String[] instructorNames = { "Brian", "Kaleb", "Zan"};
            for (String instructorName : instructorNames) {
                Instructor instructor = new Instructor(instructorName);
                hire(instructor);
            }
        }

    public static void hire(Instructor instructor){
        instructorList.add(instructor);
    }

    public static ArrayList getInstructors(){
        return instructorList;
    }

    public static void fireStaff(){
        instructorList.clear();
    }
}
