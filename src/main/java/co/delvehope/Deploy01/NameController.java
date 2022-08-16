package co.delvehope.Deploy01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @Autowired
    private Environment environment;

    @GetMapping("/")
    public String getName(){
        String var = environment.getProperty("myCustomVarTree.questomVar");
        return var;
    }
}
