package ssm.hmily_blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class commentController {
    @RequestMapping("/toMessageBoard")
    public String toMessageBoard(){
        return "messageBoard";
    }
}
