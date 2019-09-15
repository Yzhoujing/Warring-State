package comp1110.ass2;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

import static comp1110.ass2.TestUtility.*;


public class u5924220WarringStatesGameTest {

    @Test
    public void testrowNcol() {
        char[][] row = {{'A','G','M','S','Y','4'},{'B','H','N','T','Z','5'},{'C','I','O','U','0','6'},{'D','J','P','V','1','7'},{'E','K','Q','W','2','8'},{'F','L','R','X','3','9'}};
        char[][] col = {{'A','B','C','D','E','F'},{'G','H','I','J','K','L'},{'M','N','O','P','Q','R'},{'S','T','U','V','W','X'},{'Y','Z','0','1','2','3'},{'4','5','6','7','8','9'}};

        for (int i = 0; i < 6; i++){
            List<Character> list = new ArrayList<Character>();
            for (char c : row[i]){
                list.add(c);
            }
            List<Character> t = pickNRandom(list,2);
            assertTrue(WarringStatesGame.rowNcol(t.get(0),t.get(1)));
        }
        for (int i = 0; i < 6; i++){
            List<Character> list = new ArrayList<Character>();
            for (char c : col[i]){
                list.add(c);
            }
            List<Character> t = pickNRandom(list,2);
            assertTrue(WarringStatesGame.rowNcol(t.get(0),t.get(1)));
        }
        assertFalse(WarringStatesGame.rowNcol('A','H'));
        assertFalse(WarringStatesGame.rowNcol('9','B'));
        assertFalse(WarringStatesGame.rowNcol('9','1'));
        assertFalse(WarringStatesGame.rowNcol('1','C'));
    }

    public static List<Character> pickNRandom(List<Character> lst, int n) {
        List<Character> copy = new LinkedList<Character>(lst);
        Collections.shuffle(copy);
        return copy.subList(0, n);
    }

    @Test
    public void takeRow(){
        for (int i = 0; i < PLACEMENTS.length; i++) {
            String p = TestUtility.shufflePlacement(PLACEMENTS[i]);
            char[] test = WarringStatesGame.takeRow(p);
            char zylocation=' ';
            for (int j=0; j<p.length();j+=3){
                if (p.charAt(j)=='z'){
                    zylocation=p.charAt(j+2);
                    break;
                }
            }
            boolean contains = false;
            for (char c : test){
                if (c==zylocation){
                    contains = true;
                    break;
                }
            }
            assertTrue(contains); /*https://stackoverflow.com/questions/18581531/in-java-how-can-i-determine-if-a-char-array-contains-a-particular-character/18581682*/
        }
    }

    @Test
    public void takeCol() {
        for (int i = 0; i < PLACEMENTS.length; i++) {
            String p = TestUtility.shufflePlacement(PLACEMENTS[i]);
            char[] test = WarringStatesGame.takeCol(p);
            char zylocation = ' ';
            for (int j = 0; j < p.length(); j += 3) {
                if (p.charAt(j) == 'z') {
                    zylocation = p.charAt(j + 2);
                    break;
                }
            }
            boolean contains = false;
            for (char c : test) {
                if (c == zylocation) {
                    contains = true;
                    break;
                }
            }
            assertTrue(contains);
        }
    }
}
