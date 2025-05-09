package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloController {

    @GetMapping
    public String olaMundo(){
        return "Eu amo a naiely e vou casar com ela, porque ela é muito gostosa e hoje nois vai transar bem gostoso!";
    }
}
