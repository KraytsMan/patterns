package PrototypePattern;

public class CloneFactory {

    public Clone getClone(Clone clone)
    {
        return clone.makaClone();
    }

}
