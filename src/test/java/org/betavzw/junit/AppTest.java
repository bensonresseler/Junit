package org.betavzw.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test(expected = IllegalArgumentException.class)
    public void testNaamNietLeeg()
    {
        Persoon p = new Persoon("", "Vermeulen", LocalDate.of(2000, 1, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGeboortedatumInToekomst()
    {
        Persoon p = new Persoon("Joske", "Vermeulen", LocalDate.of(2021, 1, 1));
    }
}

