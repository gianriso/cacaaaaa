package ubb.electivo.persona.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import ubb.electivo.persona.entidades.Cliente;

public interface ClienteRepositorio  extends JpaRepository <Cliente,Long> {

}
