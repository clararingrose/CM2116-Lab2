public class PowerExperiments {
    public static void main(String[] args) throws Exception {
        simplePowerExperiments();
    }

    static double power(double x, int n){
        double p = 1;

        for(int i = 1; i <= n; i++){
            p *= x;
        }

        return p;
    }

    static void simplePowerExperiments(){
        
    }
}
