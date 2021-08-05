package com.techelevator.controller;

import com.techelevator.dao.BeerDao;
import com.techelevator.model.Beer;
import com.techelevator.model.Brewery;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class BeerController {

    private BeerDao beerDao;

    public BeerController(BeerDao beerDao) { this.beerDao = beerDao; }

    @RequestMapping(path="/beer-list", method = RequestMethod.GET)
    public List<Beer> list() { return beerDao.getAllBeers(); }

    @RequestMapping(path="/beer-list/{id}", method = RequestMethod.GET)
    public Beer get(@PathVariable int id) { return beerDao.getBeerById(id); }

    @RequestMapping(path="/breweries/{id}/beer", method = RequestMethod.GET)
    public List<Beer> listByBrewery(@PathVariable int id) { return beerDao.getBeersByBreweryId(id); }

    @RequestMapping(path = "/beer-list/{id}", method = RequestMethod.PUT)
    public void update(@RequestBody Beer beer, @PathVariable int id) {
        beerDao.update(beer);
    }
}
