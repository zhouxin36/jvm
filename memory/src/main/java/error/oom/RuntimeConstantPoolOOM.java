package error.oom;

/**
 * 在JDK1.6中，会得到两个false，在1.7后，一个true一个false
 * 1.6中，intern会将字符串复制到常量池
 * 1.7后，intern会将字符串的引用写入常量池
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        String str1 = new StringBuffer("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }
}
