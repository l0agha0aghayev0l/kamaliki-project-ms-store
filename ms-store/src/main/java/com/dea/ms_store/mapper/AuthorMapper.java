package com.dea.ms_store.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.dea.ms_store.dto.AuthorDto;
import com.dea.ms_store.entity.Author;

@Mapper(
    componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface AuthorMapper {

    AuthorDto toDto(Author author);
    
    Author toEntity(AuthorDto authorDto);
}
