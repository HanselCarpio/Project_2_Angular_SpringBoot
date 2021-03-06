package com.example.labspringboot.repository;

import com.example.labspringboot.domain.Rol;
import com.example.labspringboot.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

    @Query(value = "GetAllUsers", nativeQuery = true)
    List<Users> getAllUsers();

    @Query(value = "{ call GetUser(:IDuser)}", nativeQuery = true) Users getUserById(@Param("IDuser") Integer id);

    @Query(value = "{ call logIn(:Email)}", nativeQuery = true) Users logIn(@Param("Email") String email);

    @Procedure(name = "Users.insertUser") void insertUserSP(@Param("IDrol") int idRol,
                                                            @Param("Name") String name,
                                                            @Param("DNI") String dni,
                                                            @Param("Age") int age,
                                                            @Param("Telephone") String telephone,
                                                            @Param("Email") String email,
                                                            @Param("Clave") String clave );

    @Procedure(name = "Users.updateUser") void updateUserSP(@Param("IDuser") int iduser,
                                                            @Param("IDrol") int idRol,
                                                            @Param("Name") String name,
                                                            @Param("DNI") String dni,
                                                            @Param("Age") int age,
                                                            @Param("Telephone") String telephone,
                                                            @Param("Email") String email,
                                                            @Param("Clave") String clave);

    @Procedure(name = "Users.deleteUser") void deleteUserSP(@Param("IDuser") int id);



}