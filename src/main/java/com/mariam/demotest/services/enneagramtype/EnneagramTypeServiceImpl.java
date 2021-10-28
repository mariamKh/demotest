package com.mariam.demotest.services.enneagramtype;

import com.mariam.demotest.models.EnneagramType;
import com.mariam.demotest.repositories.EnneagramTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnneagramTypeServiceImpl implements EnneagramTypeService {

    private EnneagramTypeRepository enneagramTypeRepository;

    @Autowired
    public EnneagramTypeServiceImpl(EnneagramTypeRepository enneagramTypeRepository) {
        this.enneagramTypeRepository = enneagramTypeRepository;
    }

    @Override
    public EnneagramType findByID(int id) {
        return enneagramTypeRepository.findById(id).get();
    }

    @Override
    public EnneagramType findByIndex(int index) {
        return enneagramTypeRepository.findByIndex(index);
    }
}
