import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.jupiter.api.Test;

public class Lang3TryToUseTest {
    //驱动模块
    int driver_max(int[] x){
        Lang3TryToUse lang3TryToUse = new Lang3TryToUse();
        return lang3TryToUse.max(x);
    }

    int driver_min(int[] x){
        Lang3TryToUse lang3TryToUse = new Lang3TryToUse();
        return lang3TryToUse.min(x);
    }
    //桩模块
    int[] base_min(int[] x){return x;}
    int[] base_max(int[] x){return x;}

    @org.junit.Test
    public void test_min() {
        int[]x = new int[]{123,31,5,-1,-20,1456};
        assertEquals(-20,driver_min(base_min(x)));
    }

    @org.junit.Test
    public void test_max() {
        int[]x = new int[]{12,5151,6321,123,61612};
        assertEquals(61612,driver_max(base_max(x)));
    }

    @org.junit.Test
    public void test_judge1() {
        NumberUtils numberUtils = new NumberUtils();
        Lang3TryToUse lang3TryToUse = new Lang3TryToUse();
        int flag = 1;
        int[] x = new int[]{123, 4151, 161, 1261, 886};
        assertEquals(4151, Lang3TryToUse.judge1(flag, x));
        flag = -1;
        assertEquals(0, Lang3TryToUse.judge1(flag, x));
        flag = 11;
        assertEquals(123, Lang3TryToUse.judge1(flag, x));
    }

    @org.junit.Test
    public void test_isDigits(){
        Lang3TryToUse lang3TryToUse = new Lang3TryToUse();
        String s = new String("12354");
        assertEquals(true,lang3TryToUse.isDigital(s));
    }
}