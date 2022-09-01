package test.prest;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.presets.javacpp;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;
import test.auto.Add;

@Properties(
        inherit = javacpp.class,
        value = {
                @Platform(include = "test.h",preload = {"test"},link = "test")
                ,@Platform(value = "windows")
        },
        target = "test.auto",
        global = "test.global.Test"
)
@Namespace("test")
public class Test implements InfoMapper {
    static{
       // System.setProperty("org.bytedeco.javacpp.logger.debug","true");
        Loader.checkVersion("com.zsaltedfish", "Test");
    }
    @Override
    public void map(InfoMap infoMap) {

    }

    public static void main(String[] args) {

        System.out.println(new Add().add(1,2));
    }
}
