package com.youssefnassar.quotegenerator.dao;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.youssefnassar.quotegenerator.model.Quote;
import com.youssefnassar.quotegenerator.repo.QuoteRepository;

@Component
public class DBQuoteDAO implements IQuoteDAO
{
   final QuoteRepository quoteRepository;

   @Autowired
   public DBQuoteDAO(final QuoteRepository quoteRepository)
   {
      this.quoteRepository = quoteRepository;
   }

   @Override
   public Quote getQuote()
   {
      return this.quoteRepository.findOne(ThreadLocalRandom.current().nextInt(1, 8541 + 1));
   }
}
