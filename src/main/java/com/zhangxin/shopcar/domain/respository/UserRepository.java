package com.zhangxin.shopcar.domain.respository;

import com.zhangxin.shopcar.domain.entity.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserBean,Long> {

    UserBean findByName(String name);
}
