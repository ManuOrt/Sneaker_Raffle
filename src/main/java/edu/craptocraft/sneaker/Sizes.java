package edu.craptocraft.sneaker;

public enum Sizes
{

    TREINTAYNUEVE("6.5", "39"),
    CUARENTA("7.0", "40"),
    CUARENTAYMEDIO("7.5", "41 1/2"),
    CUARENTAYUNO("8.0", "41"),
    CUARENTAYDOS("8.5", "42"),
    CUARENTAYDOSYMEDIO("9.0", "42"),
    CUARENTAYTRES("9.5","43");
    private String USize;
    private String EUSize;

    Sizes(String USize, String EUSize)
    {
        this.USize = USize;
        this.EUSize = EUSize;
    }

    public String getUSize()
    {
        return USize;
    }

    public String getEUSize()
    {
        return EUSize;
    }

//    public String getSizes(Sizes eu,Sizes us){
//
//    }
}
