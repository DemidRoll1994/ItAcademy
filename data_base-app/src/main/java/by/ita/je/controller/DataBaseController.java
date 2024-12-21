package by.ita.je.controller;

import org.springframework.web.bind.annotation.*;
@RestController
public class DataBaseController {
    @PostMapping("/create")
    public String create(){
        return "create response not implemented";
    }
    @GetMapping("/read")
    public String read(){
        return "read response not implemented";
    }
    @PutMapping("/update")
    public String update(){
        return "update response not implemented";
    }
    @DeleteMapping("/delete")
    public String delete(){
        return "delete response not implemented";
    }

}
