package stores.web;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@GetMapping("/")
public String home() {

    return "home";
}
    @GetMapping("/login")
    public String login() {

    return "login";
    }
}