package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    // positive
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void balancedInStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void stringInBalancedReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void twoSetsBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode[]"));
    }

    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[La[unchCo]de]"));
    }

    // negative
    @Test
    public void leftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code"));
    }

    @Test
    public void rightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launc]hCode"));
    }

    @Test
    public void moreLeftBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("L[[]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("L[aun[chCo]de"));
    }

    @Test
    public void moreRightBracketsRightOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Laun]nch]Code"));
    }

    @Test
    public void wrongOrderBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void wrongOrderBracketsInStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("La]unchCo[de"));
    }


}