package com.bbqService.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class BarbequePartController {

    @Autowired
    private BarbequePartService barbequePartService;

    @GetMapping("/barbequeParts")
    public List<BarbequePart> getAllParts(){
        return barbequePartService.getAllParts();
    }

    @GetMapping("/barbequeParts/{id}")
    public BarbequePart getPart(@PathVariable String id){
        return barbequePartService.getProduct(id);
    }

    @GetMapping("/barbequeType/{typeString}")
    public List<BarbequePart> getPartsOfCertainTypes(@PathVariable String typeString){
        return barbequePartService.getPartsOfCertainTypes(typeString);
    }

    @GetMapping("/deleteAllProducts")
    public void deleteAllProducts(){
        barbequePartService.deleteAllProducts();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addPart")
    public void addPart(@RequestBody BarbequePart barbequePart){
        barbequePartService.addProduct(barbequePart);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/updatePart")
    public void updatePart(@RequestBody BarbequePart barbequePart){
        barbequePartService.updateProduct(barbequePart);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deletePart")
    public void deleteProduct(@PathVariable BarbequePart barbequePart){
        barbequePartService.deleteProduct(barbequePart);
    }
}
