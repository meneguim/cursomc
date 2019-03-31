package com.meneguim.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meneguim.cursomc.domain.Pedido;
import com.meneguim.cursomc.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired	
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new com.meneguim.cursomc.services.exceptions.ObjectNotFoundException(
						"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
	
}
	