package cz.upce.tddc.finalproject.repository;

import cz.upce.tddc.finalproject.entity.Memo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface MemosRepository extends CrudRepository<Memo, Integer> {
    
}
