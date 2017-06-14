package com.catecaro.repository;

/**
 * Created by jcuau on 13/06/2017.
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import com.catecaro.entities.Evento;
@Transactional
public interface EventoRepository  extends CrudRepository<Evento,Integer>{
}
