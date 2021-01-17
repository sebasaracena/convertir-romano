package com.tdd.demo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void RomanoTest()
    {
        Romano r=new Romano();
        assertEquals("I", r.Indentificador_Romano(1));
        assertEquals("IV", r.Indentificador_Romano(4));
        assertEquals("IX", r.Indentificador_Romano(9));
        assertEquals("X", r.Indentificador_Romano(10));
        assertEquals("XL", r.Indentificador_Romano(40));
        assertEquals("L", r.Indentificador_Romano(50));
        assertEquals("XC", r.Indentificador_Romano(90));
        assertEquals("C", r.Indentificador_Romano(100));
        assertEquals("CD", r.Indentificador_Romano(400));
        assertEquals("D", r.Indentificador_Romano(500));
        assertEquals("CM", r.Indentificador_Romano(900));
        assertEquals("M", r.Indentificador_Romano(1000));

        // Evaluate range 1-20 without num keys
        assertEquals("II", r.Indentificador_Romano(2));
        assertEquals("III", r.Indentificador_Romano(3));
        assertEquals("V", r.Indentificador_Romano(5));
        assertEquals("VI", r.Indentificador_Romano(6));
        assertEquals("VII", r.Indentificador_Romano(7));
        assertEquals("VIII", r.Indentificador_Romano(8));
        assertEquals("XI", r.Indentificador_Romano(11));
        assertEquals("XII", r.Indentificador_Romano(12));
        assertEquals("XIII", r.Indentificador_Romano(13));
        assertEquals("XIV", r.Indentificador_Romano(14));
        assertEquals("XV", r.Indentificador_Romano(15));
        assertEquals("XVI", r.Indentificador_Romano(16));
        assertEquals("XVII", r.Indentificador_Romano(17));
        assertEquals("XVIII", r.Indentificador_Romano(18));
        assertEquals("XIX", r.Indentificador_Romano(19));
        // Evaluate tens without roman keys
        assertEquals("XX", r.Indentificador_Romano(20));
        assertEquals("XXX", r.Indentificador_Romano(30));
        assertEquals("LX", r.Indentificador_Romano(60));
        assertEquals("LXX", r.Indentificador_Romano(70));
        assertEquals("LXXX", r.Indentificador_Romano(80));
        // Evaluate hundreds without roman keys
        assertEquals("CC", r.Indentificador_Romano(200));
        assertEquals("CCC", r.Indentificador_Romano(300));
        assertEquals("DC", r.Indentificador_Romano(600));
        assertEquals("DCC", r.Indentificador_Romano(700));
        assertEquals("DCCC", r.Indentificador_Romano(800));

        // Evaluate thousands without roman keys
        assertEquals("MM", r.Indentificador_Romano(2000));
        assertEquals("MMM", r.Indentificador_Romano(3000));

        assertEquals("XXXIX", r.Indentificador_Romano(39));
        assertEquals("XLIX", r.Indentificador_Romano(49));
        assertEquals("LXXXVIII", r.Indentificador_Romano(88));
        assertEquals("LXXXIX", r.Indentificador_Romano(89));
        assertEquals("XCIX", r.Indentificador_Romano(99));
        assertEquals("CDXXXIX", r.Indentificador_Romano(439));
        assertEquals("CDXLIX", r.Indentificador_Romano(449));
        assertEquals("CDL", r.Indentificador_Romano(450));
        assertEquals("CDLXXXVIII", r.Indentificador_Romano(488));
        assertEquals("CDLXXXIX", r.Indentificador_Romano(489));
        assertEquals("CDXCIX", r.Indentificador_Romano(499));
        assertEquals("DXXXIX", r.Indentificador_Romano(539));
        assertEquals("DXLIX", r.Indentificador_Romano(549));
        assertEquals("DL", r.Indentificador_Romano(550));
        assertEquals("DLXXXVIII", r.Indentificador_Romano(588));
        assertEquals("DLXXXIX", r.Indentificador_Romano(589));
        assertEquals("DXCIX", r.Indentificador_Romano(599));
        assertEquals("DCCCXXXIX", r.Indentificador_Romano(839));
        assertEquals("DCCCXLIX", r.Indentificador_Romano(849));
        assertEquals("DCCCL", r.Indentificador_Romano(850));
        assertEquals("DCCCLXXXVIII", r.Indentificador_Romano(888));
        assertEquals("DCCCLXXXIX", r.Indentificador_Romano(889));
        assertEquals("DCCCXCIX", r.Indentificador_Romano(899));
        assertEquals("CMXXXIX", r.Indentificador_Romano(939));
        assertEquals("CMXLIX", r.Indentificador_Romano(949));
        assertEquals("CML", r.Indentificador_Romano(950));
        assertEquals("CMLXXXVIII", r.Indentificador_Romano(988));
        assertEquals("CMLXXXIX", r.Indentificador_Romano(989));
        assertEquals("CMXCIX", r.Indentificador_Romano(999));
    }
}
