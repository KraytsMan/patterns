package FactoryPattern;

import java.util.ArrayList;
import java.util.Random;

public class BuildTest {

    public static void main(String[] args)
    {
        Random rand = new Random();
        for(int i=0; i<5;i++)
        {
          generateBuild(rand.nextInt(3));
        }
    }

    public static void generateBuild(int g)
    {

        switch (g) {
            case 0:
                new Ranch();
                break;

            case 1:
                new Skyscraper();
                break;

            case 2:
                new Cottege();
                break;

            default:
                // throw some build
                break;
        }
    }
}
