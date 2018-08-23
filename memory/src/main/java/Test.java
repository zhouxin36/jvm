import base.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * -Xmx10m -Xms10m -XX:+PrintGCDetails -XX:+UseG1GC
 */
public class Test {

    private final static int MAX_NUM = 10000;

    public static void main(String[] args) {
//        run();
        run2();
    }

    public static void run2(){
        Integer integer = Integer.MIN_VALUE;
        Integer min= Integer.MIN_VALUE % 4;
        System.out.println(min);
        System.out.println(integer);

    }

    public static void run(){
        /**
         * eden 7743K 28%
         *
         * Metaspace 4953K
         * class space 518K
         */
        User user = new User();
        user.setAddDate(LocalDateTime.now());
//        user.setId("id");
        user.setEmail("email");
        user.setUserName("userName");
        user.setPwd("pwd");
        user.setEmailToken("emailToken");
        user.setEmailActiveDate(LocalDateTime.now());
        user.setRealName("realName");
        user.setIdentityCard("identityCard");
        user.setAuthenticationState(true);
        user.setProblemOne("problemOne");
        user.setAnswerOne("answerOne");
        user.setProblemTwo("problemTwo");
        user.setAnswerTwo("answerTwo");
        user.setTelNo("telNo");
        user.setTelAuthenCode("telAuthenCode");
        user.setTelAuthenDate(LocalDateTime.now());
        user.setLevel(1);
        user.setLevelBeginDate(LocalDateTime.now());
        user.setLevelEndDate(LocalDateTime.now());
        user.setHeadImage("headImage");
        user.setAddDate(LocalDateTime.now());
        user.setLongAutoSetting(true);
        user.setShortAutoSetting(true);
        user.setFlowAutoSetting(true);
        user.setBankAccountNo("bankAccountNo");
        user.setBankType(1);
        user.setBankProvice("bankProvice");
        user.setBankCity("bankCity");
        user.setOpenBankName("openBankName");
        user.setAuthenState(1);
        user.setCreditGrantingAmount(new BigDecimal(1));
        user.setCheckingUsedCreditGrantingAmount(new BigDecimal(1));
        user.setUsedCreditGrantingAmount(new BigDecimal(1));
        user.setCreditGrantingStatus(1);

        long start = System.currentTimeMillis();
        /**
         * eden 9426K 34%
         *
         * Metaspace 5237K
         * class space 538K
         * time 21
         */
//        System.out.println(user.toString1());

        /**
         * eden 8268K 30%
         *
         * Metaspace 5072K
         * class space 530K
         * time 8
         */
//        System.out.println(user.toString2());

        /**
         * eden 7759K 28%
         *
         * Metaspace 4961K
         * class space 518K
         * time 1
         */
        System.out.println(user.toString3());
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
