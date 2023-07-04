package com.example.corridanaselva.Repository;

import com.example.corridanaselva.Controller.Maratona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscricaoRepository extends JpaRepository<Maratona,Long> {


}
