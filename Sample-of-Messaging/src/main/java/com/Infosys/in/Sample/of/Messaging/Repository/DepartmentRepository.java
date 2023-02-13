package com.Infosys.in.Sample.of.Messaging.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Infosys.in.Sample.of.Messaging.Entity.Department;
import com.Infosys.in.Sample.of.Messaging.Entity.User;
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

public interface UserRepository extends JpaRepository<User,Long>{

}
}