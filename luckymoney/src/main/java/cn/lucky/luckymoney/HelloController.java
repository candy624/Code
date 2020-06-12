package cn.lucky.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//@RestController
@Controller
public class HelloController {
//    @Value("${minMoney}")
//    private BigDecimal minMoney;
//
//    @Value("${description}")
//    private String description;

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping({"/hello","/hi"})
    public String say(){
//        return "说明:" + limitConfig.getDescription();
        return "index";
    }
}
