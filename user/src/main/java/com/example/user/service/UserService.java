package com.example.user.service;

import com.example.user.VO.Visa;
import com.example.user.VO.ResponseTemplateVO;
import com.example.user.entity.User;
import com.example.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithVisa(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);

        Visa visa = restTemplate.getForObject("http://VISA-SERVICE/visa/" + user.getVisaId(),Visa.class);

        vo.setUser(user);
        vo.setVisa(visa);

        return  vo;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void delete(Long userId) {
        userRepository.deleteById(userId);
    }
}