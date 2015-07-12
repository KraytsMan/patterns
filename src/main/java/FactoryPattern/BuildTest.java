package FactoryPattern;

import java.util.Random;

public class BuildTest {

    public static void main(String[] args) throws NullPointerException
    {
        Random rand = new Random();
        for(int i=0; i<5;i++)
        {
          Building building=generateBuild(rand.nextInt(3));
            building.build();
            building.destroy();
        }
    }

    public static Building generateBuild(int g)
    {

        switch (g) {
            case 0:
                return new Ranch();

            case 1:
                return new Skyscraper();


            case 2:
                return new Cottege();

            default:
                return null;
        }
    }
}
