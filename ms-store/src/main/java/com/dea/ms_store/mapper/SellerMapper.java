package com.dea.ms_store.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.dea.ms_store.dto.SellerDto;
import com.dea.ms_store.entity.Seller;

@Mapper(
    componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface SellerMapper {
    
    SellerDto toDto(Seller seller);
    Seller toEntity(SellerDto sellerDto);
}
