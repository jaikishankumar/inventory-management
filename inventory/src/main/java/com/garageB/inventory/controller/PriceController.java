package inventory.src.main.java.com.garageB.inventory.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api/parts")
public class PartsController {
    @Autowired
    private PartsService partsService;

    @PostMapping
    public Product createParts(@RequestBody Parts parts) {
        return partsService.saveParts(parts);
    }

    @GetMapping("/{id}")
    public Parts getParts(@PathVariable Long id) {
        return partsService.getProductById(id);
    }

    // Additional endpoints for updating, deleting products, etc.
}


