package test;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] strings = {"a","aa","aaa","bb"};
        Arrays.sort(strings,new LengthComparator());
        System.out.println(ToStringBuilder.reflectionToString(strings));
    }
}
