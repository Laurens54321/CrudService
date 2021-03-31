package com.bbqService.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BarbequePartRepository extends CrudRepository<BarbequePart, String> {
    @Query("SELECT u FROM BarbequePart u WHERE u.partType = ?1")
    List<BarbequePart> getPartsOfCertainTypes(String typeString);
}
