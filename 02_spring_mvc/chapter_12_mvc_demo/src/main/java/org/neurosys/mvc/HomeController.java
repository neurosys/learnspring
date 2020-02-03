package org.neurosys.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    // Bind to url "/"
    @RequestMapping("/")
    public String showPage() {
        // This is the view name "main-menu"
        // based on this information, concatenating with the prefix and suffix,
        // Spring will obtain the name of the jsp to execute so in this case
        // it will be:  /WEB-INF/view/main-menu.jsp
        return "main-menu";
    }
}
