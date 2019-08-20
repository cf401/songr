package jack.kinne.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getRoot() {
        System.out.println("root level accessed");
        // needs to match exactly the filename of a template in resources/templates
        return "helloworld";
    }

    // Models: useful for passing data to templates
    @GetMapping("/sayHello")
    public String getSayHello(@RequestParam(required=false, defaultValue = "user") String name, Model m) {
        // add any pieces of data that you want available in the template
        m.addAttribute("firstName", name);
        return "sayHello";
    }
    ///capitalize/hello with a path variable - > HELLO
    @GetMapping("/capitalize/{message}")
    public String getCapital(@PathVariable String message, Model m) {
        // add any pieces of data that you want available in the template
        m.addAttribute("message", message.toUpperCase());
        return "message";
    }

    ///capitalize/hello with a path variable - > HELLO
    @GetMapping("/reverse/{mirror}")
    public String getReverse(@PathVariable String mirror, Model m) {
        // add any pieces of data that you want available in the template
        String ready = mirror(mirror);
        m.addAttribute("mirror", ready);
        return "mirror";
    }

    public String mirror (String mirror){
        String str[] = mirror.split(" ");
        String reversed = "";
        for ( int i = str.length - 1; i >= 0; i-- ) {
            reversed = reversed + str[i] + " ";
        }
        String ready = reversed.trim();
        return ready;
    }
}
