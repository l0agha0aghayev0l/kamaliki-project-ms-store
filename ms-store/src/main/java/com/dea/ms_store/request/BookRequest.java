package com.dea.ms_store.request;

public record BookRequest(
    String name, 
    Double price, 
    Long authorId, 
    Long genreId
) 
{}
