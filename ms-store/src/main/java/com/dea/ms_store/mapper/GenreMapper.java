package com.dea.ms_store.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.dea.ms_store.dto.GenreDto;
import com.dea.ms_store.entity.Genre;

@Mapper(
    componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface GenreMapper {

    GenreDto toDto(Genre genre);
    Genre toEntity(GenreDto genreDto);
    
}
