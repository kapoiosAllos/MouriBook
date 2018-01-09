package com.company;

import java.util.ArrayList;

public class Group {
    private String name;
    private String description;
    private ArrayList <User> members = new ArrayList<User>();

    public Group (String aName, String aDescription){
        this.name = aName;
        this.description = aDescription;
    }

    public Boolean isHeOnTheGroup (User aUser){
        return members.contains(aUser);
    }

    public void makeSomeoneMember (User aUser){
        Boolean temp;
        temp = isHeOnTheGroup(aUser);
        if (!temp){
            members.add(aUser);
        }
    }

    public void printGroupMembers (){
        System.out.println("Member of group" + this.name);
        for (User member : members)
            System.out.println(member.getName());
    }

    public String getName() {
        return name;
    }
}
