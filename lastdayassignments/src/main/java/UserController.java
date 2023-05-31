import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class UserController {
        @RequestMapping("/user")
        public String getUser(Model model) {
            UserDTO user = new UserDTO("Abhishek.Chakraborty", "abhishekchakraborty776@gmail.com");

            model.addAttribute("user", user);

            return "user";
        }
}

