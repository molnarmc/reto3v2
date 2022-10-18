package com.usa.reto3v2.Repository;

import com.usa.reto3v2.Model.Room;
import com.usa.reto3v2.Repository.CrudRepository.RoomCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RoomRepository {
    @Autowired
    private RoomCrudRepository roomCrudRepository;

    public List<Room> getAll(){
        return (List<Room>) roomCrudRepository.findAll();
    }

    public Optional<Room> getRoom(int id){
        return roomCrudRepository.findById(id);
    }

    public Room save(Room room){
        return roomCrudRepository.save(room);
    }

    public void delete(Room room){
        roomCrudRepository.delete(room);
    }
}
