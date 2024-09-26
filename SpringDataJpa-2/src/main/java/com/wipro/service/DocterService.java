package com.wipro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.entity.Docter;
import com.wipro.repository.IDocterRepo;
@Service
public class DocterService implements IDocterService {
@Autowired
private IDocterRepo repo;
	@Override
	public String registerDocter(Docter docter) {
		Docter docter2=repo.save(docter);
		return "docter is saved with this id"+docter2.getDoctId();
	}
	@Override
	public String registerDocterAll(List<Docter> docters) {
		List<Docter> save=repo.saveAll(docters);
		return save.size()+"docters are saves";
	}
	@Override
	public long registredDoctersCount() {
		return repo.count();
	}
	@Override
	public boolean docterIsavailableorNot(Integer id) {
		return repo.existsById(id);
	}
	@Override
	public Iterable<Docter> showAllDcoters() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public Iterable<Docter> ShowallDoctersByIds(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return repo.findAllById(ids);
	}
	@Override
	public Optional<Docter> docterById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}
	@Override
	public String deleteDocterById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Docter> opt=repo.findById(id);
		if(opt.isPresent())
		{
			repo.deleteById(id);
			return id+ "docter is deleted";
		}
		
		else
		{
			return id+"docter is not present in oue data base";
		}
	}

}
