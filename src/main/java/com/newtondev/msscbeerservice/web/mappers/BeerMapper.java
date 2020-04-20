package com.newtondev.msscbeerservice.web.mappers;

import com.newtondev.msscbeerservice.domain.Beer;
import com.newtondev.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);

}
