package com.youssefnassar.quotegenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youssefnassar.quotegenerator.dao.IQuoteDAO;
import com.youssefnassar.quotegenerator.model.Quote;

@RestController
@RequestMapping
public class QuoteController
{
   final IQuoteDAO quoteDAO;

   @Autowired
   public QuoteController(final IQuoteDAO quoteDAO)
   {
      this.quoteDAO = quoteDAO;
   }

   @GetMapping(value = "/quote", produces = { MediaType.APPLICATION_JSON_VALUE })
   @CrossOrigin(origins = "http://localhost:3000")
   public Quote getQuote()
   {
      return quoteDAO.getQuote();
   }
}
