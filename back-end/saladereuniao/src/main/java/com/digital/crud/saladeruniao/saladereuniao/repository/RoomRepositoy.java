package com.digital.crud.saladeruniao.saladereuniao.repository;

import com.digital.crud.saladeruniao.saladereuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepositoy extends JpaRepository<Room, Long> {

}
