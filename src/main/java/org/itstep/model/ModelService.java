package org.itstep.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {
    @Autowired
    private ModelRepository modelRepository;

    public ModelCar findById(Long id) {
        return (ModelCar) modelRepository.findById(id).orElse(null);
    }
}
