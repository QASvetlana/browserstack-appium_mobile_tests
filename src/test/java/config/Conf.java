package config;


import org.aeonbits.owner.Config;

@org.aeonbits.owner.Config.LoadPolicy(org.aeonbits.owner.Config.LoadType.MERGE)
@org.aeonbits.owner.Config.Sources({"classpath:selenoidSecrets.properties",
        "classpath:browserstackSecrets.properties"})

public interface Conf extends org.aeonbits.owner.Config {

    @Key("selenoid_user")
    String selenoidUser();

    @Key("selenoid_password")
    String selenoidPassword();

    @Key("browserstack_user")
    static String browserstackUser();

    @Key("browserstack_key")
    static String browserstackKey();

    @Key("browserstack_app")
    static String browserstackApp();


}
