package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @Value(value = "${sample.text}")
    private String text;
    
    @RequestMapping("/")
    public String index() {
        return text + " from Shanmukha!";
    }

    @RequestMapping("/hello")
    public String index1() {
        System.out.println("change10");
        return text + "hello from Shanmukha!";
    }
    
}