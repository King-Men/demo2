package com.example.demo.control;

import com.example.demo.control.model.oss;
import com.example.demo.service.interfaceservice.IService;
import com.example.demo.service.serv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/aa")
public class contr {

    @Autowired
    private IService service;

    @GetMapping(value = {"", "/"})
    public List<oss> team() {
        return service.findd();
    }

    @GetMapping(value = "/{idd}")
    public oss wheris(@PathVariable int idd) {
        return service.getbyid(idd);
    }

    @PostMapping(value = {"", "/"})
    public oss createoss(@RequestBody oss x) {
        if (service.save(x)) {
            return x;
        }
        return null;
    }

    @DeleteMapping(value = "/d/{id}")
    public void deleted(@PathVariable int id) {
        service.delet(id);
    }


}
