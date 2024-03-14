package com.cg.spblaguna.service.roomreal;

import com.cg.spblaguna.model.RoomReal;
import com.cg.spblaguna.model.dto.req.RoomRealReqDTO;
import com.cg.spblaguna.model.dto.res.RoomRealResDTO;
import com.cg.spblaguna.repository.IRoomRealRepository;
import com.cg.spblaguna.repository.IRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class RoomRealServiceImpl implements  IRoomRealService {
    @Autowired
    private IRoomRealRepository roomRealRepository;


    @Override
    public List<RoomReal> findAll() {
        return roomRealRepository.findAll();
    }



    @Override
    public Optional<RoomReal> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(RoomReal roomReal) {
        roomRealRepository.save(roomReal);
    }

    @Override
    public void deleteById(Long id) {
        roomRealRepository.deleteById(id);
    }


}