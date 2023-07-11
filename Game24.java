import java.util.*;

public class Game24 {

       public static void main(String[] args)
       {
           int[] a= new int[]{5,2,7,8};
           System.out.println(judgePoint24(a));

           float x=0.3f;
           float y=0.2f;
           float z=x*y;
           System.out.println(z==0.06);
           System.out.println(z);
       }
        public static boolean judgePoint24(int[] nums) {
            List<Double> doubleNums = new ArrayList<>();

            for (final int num : nums)
                doubleNums.add((double) num);

            return dfs(doubleNums);
        }

        private static boolean dfs(List<Double> nums) {
            if (nums.size() == 1)
                return Math.abs(nums.get(0) - 24.0) < 0.001;

            for (int i = 0; i < nums.size(); ++i)
                for (int j = i + 1; j < nums.size(); ++j)
                    for (final double num : generate(nums.get(i), nums.get(j))) {
                        List<Double> nextRound = new ArrayList<>(Arrays.asList(num));
                        for (int k = 0; k < nums.size(); ++k) {
                            if (k == i || k == j) // Used in generate()
                                continue;
                            nextRound.add(nums.get(k));
                        }
                        if (dfs(nextRound))
                            return true;
                    }

            return false;
        }

        private static double[] generate(double a, double b) {
            return new double[] {a * b, a / b, b / a, a + b, a - b, b - a};
        }
    }

