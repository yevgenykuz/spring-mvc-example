package me.yevgeny;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Yevgeny Kuznetsov
 * @since 0.0.1, 17 September 2019
 **/
@Controller
public class ExampleController {

    @RequestMapping(value = "/")
    public String welcomeMessage() {
        return "example"; // This tells Spring to show "example.jsp" when "/" URL gets a request
    }
}
