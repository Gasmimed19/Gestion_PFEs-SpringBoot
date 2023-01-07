package tn.essat.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.model.Pfe;
@Repository
public interface IPfe extends JpaRepository<Pfe, Integer> {
	public Pfe findByTitre(String titre);
	public List<Pfe> findByType(String type);

}
