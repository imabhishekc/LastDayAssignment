import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class MyController {
    @RequestMapping("/message")
    public String iLoveJava(Model model) {
        var message = "Hello, world!";
        var count = 10;

        model.addAttribute("message", message);
        model.addAttribute("count", count);

        String textblock = """
            This is the last assignment of Telusko 10 day challenge.
            I enjoyed all these sessions which included lot of knowledge and joy.
            And this message is shown in a text block.
            I'm enjoying JAVA.
            """;

        return "iLoveJava";
    }
}
