package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by liuyahong on 2016/4/26.
 */

public interface UserRepository extends JpaRepository<User,Long> {
     User findByEmail(String email);
     User findByUsername(String username);
     User findByEmailAndPassword(String email, String password);
    }
