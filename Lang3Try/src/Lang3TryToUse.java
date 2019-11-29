import org.apache.commons.lang3.math.NumberUtils;

public class Lang3TryToUse {
    public static int min(int[] x){
        NumberUtils numberUtils = new NumberUtils();
        int result;
        result = numberUtils.min(x);
        return result;
    }

    public static int max(int[] x){
        NumberUtils numberUtils = new NumberUtils();
        int result;
        result = numberUtils.min(x);
        return result;
    }

    public static boolean isDigital(String s){
        NumberUtils numberUtils = new NumberUtils();
        boolean result = numberUtils.isDigits(s);
        return result;
    }

    public static int judge1(int a,int[] x){
        if(a>0&&a<10){
            System.out.println("Max = ");
            return max(x);
        }else if(a>=10){
            System.out.println("Min = ");
            return min(x);
        }else {
            return 0;
        }
    }

    public static void main(String[] args){
        String s = new String("12345");
        int[] x = new int[]{123,141,61,1,-99,31,235};
        boolean SisD = isDigital(s);
        if(SisD){
            System.out.println("s is digits");
        }else{
            System.out.println("s is not digits");
        }
        int x1=-1;
        int x2=2;
        int x3=1;
        int x4=11;
        int z;

        z=judge1(x1,x);
        System.out.println(z);
        z=judge1(x2,x);
        System.out.println(z);
        z=judge1(x3,x);
        System.out.println(z);
        z=judge1(x4,x);
        System.out.println(z);
    }
}
