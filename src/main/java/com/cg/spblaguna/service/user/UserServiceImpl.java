package com.cg.spblaguna.service.user;

import com.cg.spblaguna.model.User;
import com.cg.spblaguna.repository.IUserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional

public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;
    @Override
    public List<User> findAll() {
        return iUserRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return iUserRepository.findById(id);
    }

    @Override
    public User save(User user) {
        iUserRepository.save(user);
        return user;
    }

    @Override
    public void deleteById(Long id) {
        iUserRepository.deleteById(id);
    }

    @Override
    public User findUserByEmailAndPhone(String email, String phone) {
        return iUserRepository.findUserByEmailAndPhone(email, phone);
    }
}
