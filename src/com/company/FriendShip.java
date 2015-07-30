package com.company;

import ihs.apcs.spacebattle.BasicEnvironment;
import ihs.apcs.spacebattle.BasicGameInfo;
import ihs.apcs.spacebattle.BasicSpaceship;
import ihs.apcs.spacebattle.Environment;
import ihs.apcs.spacebattle.RegistrationData;
import ihs.apcs.spacebattle.Spaceship;
import ihs.apcs.spacebattle.commands.IdleCommand;
import ihs.apcs.spacebattle.commands.ShipCommand;

import java.awt.*;

/**
 * Created by ottawat on 7/30/15.
 */

public class FriendShip extends BasicSpaceship {
    public FriendShip() {
    }

    public RegistrationData registerShip(int var1, int var2, int var3){
        RegistrationData rs = new RegistrationData("Friendship", Color.red, 1);

        return rs;
    }

    public ShipCommand getNextCommand(BasicEnvironment var1){
        IdleCommand ic = new IdleCommand(15);

        return ic;
    }

    public ShipCommand getNextCommand(Environment<BasicGameInfo> var1) {
        return this.getNextCommand(new BasicEnvironment(var1));
    }

    public void shipDestroyed() {
    }
}
