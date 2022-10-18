package com.usa.reto3v2.Controller;

import com.usa.reto3v2.Model.Room;
import com.usa.reto3v2.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping("/api/Room")

public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping("/all")
    public List<Room> getAll(){
        return roomService.getAll();
    }

    @GetMapping("{id}")
    public Optional<Room> getRoom(@PathVariable("id") int id){
        return roomService.getRoom(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Room save(@RequestBody Room room){
        return roomService.save(room);
    }


}

