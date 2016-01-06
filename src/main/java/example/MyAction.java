package example;

import javax.inject.Inject;

public class MyAction {

    private final MyService myService;

    @Inject
    MyAction(final MyService myService) {
        this.myService = myService;
    }

    public String getHello() {
        return myService.hello();
    }

    public String execute() {
        return "success";
    }
}
