package com.company;
import java.util.Random;
import static jdk.nashorn.internal.objects.NativeMath.random;

public class Dice {
    Random random = new Random();

    public void roll (){
        random(6);
    }

}
