package org.neurosys.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    // A controller to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // A controller to process the HTML form
    // It's not mandatory to have parameters to the message, but since we want to do some
    // minor processing, it helps :-)
    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName");
        String convertedName = "Yo!!!! " + name.toUpperCase();

        // This will be available in the JSP as ${message}
        model.addAttribute("message", convertedName);

        return "helloworld";
    }
}
