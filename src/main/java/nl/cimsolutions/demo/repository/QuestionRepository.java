/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.cimsolutions.demo.repository;

import nl.cimsolutions.demo.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author k.ali
 */
@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}