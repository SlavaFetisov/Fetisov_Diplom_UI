package config;

import org.aeonbits.owner.Config;

import java.net.URL;


@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebDriverConfig extends Config {

    @DefaultValue("https://shop.proamk.ru")
    String baseUrl();

    @DefaultValue("firefox")
    String browser();

    @DefaultValue("113")
    String browserVersion();

    @DefaultValue("1920x1080")
    String browserSize();

    @DefaultValue("false")
    boolean isRemote();

    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub/")
    URL remoteUrl();

}