package com.company;

import ihs.apcs.spacebattle.TextClient;
import org.omg.CORBA.FREE_MEM;

public class Main {

    public static void main(String[] args) {
        FriendShip fs = new FriendShip();
        TextClient.run("139.126.202.35", fs);
    }
}
