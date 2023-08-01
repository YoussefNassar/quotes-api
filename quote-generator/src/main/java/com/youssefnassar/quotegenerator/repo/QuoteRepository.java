package com.youssefnassar.quotegenerator.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.youssefnassar.quotegenerator.model.Quote;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Integer>
{
}
