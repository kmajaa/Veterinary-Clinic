package pl.polsl.veterynaryclinic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RedirectLoginController {

    @Autowired
    private HttpServletRequest request;

    @PostMapping("/redirect_login")
    public String redirectLogin(Model model) {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        model.addAttribute("login", login);
        model.addAttribute("password", password);
        return "redirect_login";
    }
}
