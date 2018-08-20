package error.oom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * StackOverflowError 递归
 */
public class StackOver {

    private final static Logger logger = LoggerFactory.getLogger(StackOver.class);

    private static void tr(int index,String userName){
        logger.info("index:{},userName:{}",index,userName);
        index++;
        tr(index,userName);
    }

    public static void main(String[] args) {
        tr(0,"zhouxin");
    }
}
