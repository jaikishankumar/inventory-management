package inventory.src.main.java.com.garageB.inventory.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PartsService {
    @Autowired
    private PartsRepository partsRepository;

    public Parts saveParts(Parts parts) {
        return productRepository.save(parts);
    }

    // Add methods for update.
}
