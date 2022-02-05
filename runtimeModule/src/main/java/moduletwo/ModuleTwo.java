package moduletwo;

import javax.inject.Singleton;

import greeting.Greeting;

@Singleton
public class ModuleTwo implements Greeting {

    @Override
    public String getGreeting() {
        return "Loaded from ModuleTwo";
    }

}
