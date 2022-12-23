package com.m2i.CRM.mapper;

import com.m2i.CRM.controller.dto.OrderDto;
import com.m2i.CRM.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface OrderMapper {
    @Mapping(target="id", ignore = true)
    OrderDto mapOrderToOrderDto(Order order);
    Order mapOrderDtoToOrder(OrderDto orderDto);
}
