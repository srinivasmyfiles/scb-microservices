package com.cts.brownfield.pss.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.brownfield.pss.entity.Flight;

@FeignClient(name = "search-service")
@RibbonClient(name="search-proxy")
public interface SearchServiceProxy {

	@GetMapping("api/pss/findFlight/{id}")
	Flight findFlight(@PathVariable("id") long id);

}
