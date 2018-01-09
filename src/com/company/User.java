package com.company;

import java.util.ArrayList;

public class User {

    private String name;
    private String email;
    private ArrayList <User> friends = new ArrayList<User>();
    private ArrayList <Group>  groups = new ArrayList<Group>();

    public User(String name,String email) {
        this.name = name;
        this.email = email;
    }

    private boolean areWeFriends(User aUser){
        return friends.contains(aUser);
    }

    public void friendRequest(User aUser){
        Boolean amI = areWeFriends(aUser);
        if (!amI){
            friends.add(aUser);
            aUser.friends.add(this);
            System.out.println(this.name + " and " + aUser.name + " are now friends!");
        }
        else
            System.out.println("You are all ready friends");
    }

    private ArrayList<User> getFriends() {
        return friends;
    }

    private ArrayList <User> commonFriends(User aUser){
        ArrayList<User> common  = new ArrayList<>(this.friends);
        common.retainAll(aUser.friends);
        return common;
    }


    public void printCommonFriends (User aUser){
        System.out.println("Common friends of  " + this.name + " and " + aUser.name);
        for (User user : commonFriends(aUser)) {
            System.out.println(user.name);
        }
    }

    public void printMyFriends (){
        System.out.println("Friends of " + this.name);
        for (User friends : friends)
            System.out.println(friends.getName());
    }

    public void makeMeMemberOfGroup(Group aGroup){
        Boolean temp;
        temp = aGroup.isHeOnTheGroup(this);
        if (!temp) {
            groups.add(aGroup);
            aGroup.makeSomeoneMember(this);
        }
    }

    public void printMyGroups (){
        System.out.println("Groups that " + name + " has enrolled");
        for (Group group : groups)
            System.out.println(group.getName());
    }

    public String getName() {
        return name;
    }


}
