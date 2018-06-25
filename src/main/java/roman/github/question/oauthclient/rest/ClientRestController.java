package roman.github.question.oauthclient.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/client")
public class ClientRestController {

    @GetMapping("/print")
    public void printId(Principal principal) {
        System.out.println(principal);
    }
}
