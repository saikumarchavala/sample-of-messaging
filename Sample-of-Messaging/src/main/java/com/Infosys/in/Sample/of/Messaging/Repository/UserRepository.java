package com.Infosys.in.Sample.of.Messaging.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Infosys.in.Sample.of.Messaging.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {



	public User save(User user);

}
