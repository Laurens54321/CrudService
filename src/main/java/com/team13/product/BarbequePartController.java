package com.team13.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BarbequePartController {

    @Autowired
    private BarbequePartService barbequePartService;

    @RequestMapping("/barbequeParts")
    public List<BarbequePart> getAllParts(){
        return barbequePartService.getAllParts();
    }

    @RequestMapping("/barbequeParts/{id}")
    public BarbequePart getPart(@PathVariable String id){
        return barbequePartService.getProduct(id);
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
