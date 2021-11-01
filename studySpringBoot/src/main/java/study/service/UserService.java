package study.service;

import org.springframework.stereotype.Service;
import study.model.User;

@Service
public interface UserService  {

     User findUserById(String userId );
}
