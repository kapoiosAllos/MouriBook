package com.company;

public class Main {

    public static void main(String[] args) {
        User u1 = new User("Teo", "chaikalis@uom.gr");
        User u2 = new User("Makis", "makis@uom.gr");
        User u3 = new User("Petros", "petros@uom.gr");
        User u4 = new User("Stefania", "stefania@uom.gr");
        User u5 = new User("Nikoleta", "nikoleta@uom.gr");
        User u6 = new User("Marina", "marina@uom.gr");

        System.out.println(u1);

        Group g1 = new Group("Efarmosmeni", "Ena group gia tous kammenous pliroforikous");
        Group g2 = new Group("Oikonomikwn Epistimon", "Oloi oi giapides se ena meros!");

        u1.friendRequest(u2);
        u2.friendRequest(u3);
        u1.friendRequest(u3);
        u1.friendRequest(u4);
        u1.friendRequest(u5);
        u4.friendRequest(u2);
        u4.friendRequest(u5);
        u6.friendRequest(u1);
        u6.friendRequest(u2);

        System.out.println("**************************");

        u1.printCommonFriends(u3);

        System.out.println("**************************");

        u3.printCommonFriends(u1);

        System.out.println("**************************");

        u1.printMyFriends();

        System.out.println("**************************");

        u2.printMyFriends();

        System.out.println("**************************");

        u1.makeMeMemberOfGroup(g1);
        u1.makeMeMemberOfGroup(g2);
        u2.makeMeMemberOfGroup(g1);
        u5.makeMeMemberOfGroup(g1);
        u6.makeMeMemberOfGroup(g1);

        u1.printMyGroups();

        System.out.println("**************************");

        g1.printGroupMembers();

        System.out.println("**************************");












    }
}
