package com.usa.reto3v2.Controller;

import com.usa.reto3v2.Model.Admin;
import com.usa.reto3v2.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping("/api/Admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    // /api/Admin/all
    @GetMapping("/all")
    public List<Admin> getAll(){

        return adminService.getAll();
    }

    @GetMapping("/{id}") //
    public Optional<Admin> getAdmin(@PathVariable("id") int id){

        return adminService.getAdmin(id);
    }

    // /api/Admin/save
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Admin save(@RequestBody Admin admin){
        return adminService.save(admin);
    }


}
