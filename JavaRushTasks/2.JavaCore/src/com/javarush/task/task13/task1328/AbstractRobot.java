package com.javarush.task.task13.task1328;

import java.util.Random;

public abstract class AbstractRobot implements Attackable, Defensable {
    private static int hitCount;
    private String name;


    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        //hitCount = hitCount + 1;
        Random rnd = new Random();
        hitCount = rnd.nextInt(4) + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
//            hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        } else if (hitCount == 4) {
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
//        hitCount = hitCount + 2;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            hitCount = 1;
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 4) {
            hitCount = 2;
            defendedBodyPart = BodyPart.CHEST;

        }
        return defendedBodyPart;
    }

    public String getName() {
        return name;
    }
}
