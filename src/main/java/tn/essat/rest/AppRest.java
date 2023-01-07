package tn.essat.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.dao.IPfe;
import tn.essat.model.Pfe;
@CrossOrigin("*")
@RestController
@RequestMapping("/rest")
public class AppRest {
	@Autowired
	IPfe pfedao;
	
	@GetMapping("/pfes")
	public List<Pfe> f1(){
		List<Pfe> pfes=pfedao.findAll();
		return pfes;
	}
	
	@PostMapping("addpfe")
	public void f2(@RequestBody Pfe pfe) {
		pfedao.save(pfe);	
	}
	
	@DeleteMapping("deletepfe/{id}")
	public void f3(@PathVariable("id")int id) {
		pfedao.deleteById(id);
	}
	
	@GetMapping("/pfebytitle/{titre}")
	public Pfe f4(@PathVariable("titre") String titre) {
		Pfe pfe = pfedao.findByTitre(titre);
		return pfe;
	}
	
	@GetMapping("/pfebytype/{type}")
	public List<Pfe> f5(@PathVariable("type") String type) {
		List<Pfe> pfes = pfedao.findByType(type);
		return pfes;
	}
	
	

}
