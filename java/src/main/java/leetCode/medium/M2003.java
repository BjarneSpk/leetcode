package leetCode.medium;

import java.util.Arrays;
import java.util.TreeMap;

public class M2003 {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        Arrays.sort(potions);
        TreeMap<Long, Integer> map = new TreeMap<>();
        map.put(Long.MAX_VALUE, potions.length);

        for (int i = potions.length - 1; i >= 0; i--) {
            map.put((long) potions[i], i);
        }
        for (int i = 0; i < spells.length; i++) {
            long need = (success + spells[i] - 1) / spells[i];
            spells[i] = potions.length - map.ceilingEntry(need).getValue();
        }
        return spells;
    }

    public int[] successfulPair(int[] spells, int[] potions, long success) {
        Arrays.sort( potions );
        for (int i = 0; i < spells.length; i++) {
            int first = 0;
            int last = potions.length - 1;
            int mid;  
            while ( first <= last ) { 
                mid = first + (last - first) / 2;
                long key = spells[i] * potions[mid];
                if ( key >= success ) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            } 
            spells[i] = potions.length - first;
        } 
        return spells; 
    }  
}
