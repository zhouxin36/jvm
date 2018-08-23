package classloading;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    
    private static final Logger logger = LoggerFactory.getLogger(Test.class);
    
    public static void main(String[] args) {
//        logger.info(SubClass.value);
//        SuperClass[] sca = new SuperClass[10];
//        test();
        test1();
    }

    private static void test(){
        //BootstrapClassLoader
        logger.info(System.getProperty("sun.boot.class.path"));
        //ExtClassLoader
        logger.info(System.getProperty("java.ext.dirs"));
        //AppClassLoader
        logger.info(System.getProperty("java.class.path"));
    }
    
    private static void test1(){
        ClassLoader classLoader = Test.class.getClassLoader();
//        logger.info("<>"+ ToStringBuilder.reflectionToString(classLoader, ToStringStyle.SHORT_PREFIX_STYLE));
    }


}
