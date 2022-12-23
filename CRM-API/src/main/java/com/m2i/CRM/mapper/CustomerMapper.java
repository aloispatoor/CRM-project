package com.m2i.CRM.mapper;

import com.m2i.CRM.controller.dto.CustomerDto;
import com.m2i.CRM.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CustomerMapper {
    @Mapping(target="id", ignore = true)
    CustomerDto mapCustomerToCustomerDto(Customer customer);
    Customer mapCustomerDtoToCustomer(CustomerDto customerDto);
}
