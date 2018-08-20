package chapternine;

import java.io.FileInputStream;
import java.io.InputStream;

public class Test {

    public static void main(String[] args) throws Throwable{
        InputStream inputStream = new FileInputStream("E:/idea-project/jvm/memory/out/production/classes/Test.class");
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        inputStream.close();

        JavaClassExecuter.execute(bytes);
    }

}
