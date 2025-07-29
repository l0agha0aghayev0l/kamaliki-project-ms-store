package com.dea.ms_store.response;

public record BookResponse <T> (String message, T body){}
