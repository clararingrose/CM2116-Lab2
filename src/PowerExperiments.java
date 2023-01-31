public class PowerExperiments {

    static private int count = 0;

    public static void main(String[] args) throws Exception {
        smartPowerExperiments();
    }

    static double power(double x, int n){
        double p = 1;

        for(int i = 1; i <= n; i++){
            p *= x;
            count++;
        }

        return p;
    }

    static void simplePowerExperiments(){
        System.out.println("n,count");

        for(int i = 0; i <= 20; i++){
            count = 0;
            power(2,i);
            System.out.println(i + "," + count);
        }
    }

    static double smartPower(double x, int n){
        double p = 1;
        double q = x;
        int m = n;

        while (m > 0){
            if (m % 2 != 0){
                p = p * q;
            }
            m = (int)Math.floor(m/2);
            q = q * q;
            count++;
        }
        
        return p;
    }

    static void smartPowerExperiments(){
        System.out.println("n,count");
        for (int i = 0; i <= 20; i++){
            count = 0;
            smartPower(2,i);
            System.out.println(i + "," + count);
        }
    }
}
