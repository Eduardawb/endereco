package com.example.corridanaselva.Repository;
import com.example.corridanaselva.Controller.Maratona;
import com.example.corridanaselva.Entity.MaratonistaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface MaratonistaRepository extends JpaRepository<Maratona,Long> {


}
