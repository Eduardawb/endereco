package com.example.corridanaselva.Repository;

import com.example.corridanaselva.Controller.Maratona;
import com.example.corridanaselva.Entity.CircuitoEntity;
import com.example.corridanaselva.Entity.MaratonistaEntity;
import javafx.css.Styleable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public  interface CircuitoRepository extends JpaRepository<Maratona,Long> {
}