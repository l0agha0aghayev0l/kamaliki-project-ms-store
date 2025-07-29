package com.dea.ms_store.mapper;

import com.dea.ms_store.request.BookRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

import com.dea.ms_store.dto.BookDto;
import com.dea.ms_store.entity.Book;
import org.mapstruct.factory.Mappers;

@Mapper(
    componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDto toDto(Book book);
    Book toEntity(BookDto bookDto);

    @Mapping(target= "authorDto.id", source="authorId")
    @Mapping(target = "genreDto.id", source = "genreId")
    BookDto toDto(BookRequest bookRequest);
}
