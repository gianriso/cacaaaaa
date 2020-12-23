package ubb.electivo.persona.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import ubb.electivo.persona.entidades.Persona;

public interface PersonaRepositorio  extends JpaRepository <Persona,Long>{

}
