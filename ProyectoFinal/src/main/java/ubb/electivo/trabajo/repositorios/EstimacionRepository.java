package ubb.electivo.trabajo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ubb.electivo.trabajo.entidades.Estimacion_trabajo;

public interface EstimacionRepository extends JpaRepository <Estimacion_trabajo,Long> {

}
