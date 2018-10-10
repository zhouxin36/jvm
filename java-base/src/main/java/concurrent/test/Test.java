package concurrent.test;

public class Test {

    private static volatile boolean is = true;

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        char[] chars = {'a', 'b', 'c', 'd', 'e'};

        new PrintNums(nums).start();
        new PrintChars(chars).start();
    }

    public static class PrintNums extends Thread {

        private int[] nums;

        public PrintNums(int[] nums) {
            this.nums = nums;
        }

        public void run() {
            int j = 0;
            while (true) {
                if (!is) {
                    continue;
                }
                for (int i = 0; i < 2 && j < nums.length; i++) {
                    System.out.print(nums[j]);
                    j++;
                }
                is = false;
            }
        }
    }

    public static class PrintChars extends Thread {

        private char[] chars;

        public PrintChars(char[] chars) {
            this.chars = chars;
        }

        public void run() {
            int j = 0;
            while (true) {
                if (is) {
                    continue;
                }
                for (int i = 0; i < 1 && j < chars.length; i++) {
                    System.out.print(chars[j]);
                    j++;
                }
                is = true;
            }
        }
    }
}
