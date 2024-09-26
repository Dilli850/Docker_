package com.wipro.service;

import java.util.List;
import java.util.Optional;

import com.wipro.entity.Docter;

public interface IDocterService {
public String registerDocter(Docter docter);

public String registerDocterAll(List<Docter> docters);
public long registredDoctersCount();


public boolean docterIsavailableorNot(Integer id);

public Iterable<Docter> showAllDcoters();

public Iterable<Docter> ShowallDoctersByIds(Iterable<Integer> ids);
public Optional<Docter> docterById(Integer id);

public String deleteDocterById(Integer id);
}
