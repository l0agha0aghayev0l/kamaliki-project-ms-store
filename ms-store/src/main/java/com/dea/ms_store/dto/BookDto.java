package com.dea.ms_store.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BookDto {
    
    private Long id;
    private String name;
    private Double price;
    private AuthorDto authorDto;
    private GenreDto genreDto;
    private SellerDto sellerDto;
}
