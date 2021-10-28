package com.mariam.demotest.services.enneagramtype;

import com.mariam.demotest.models.EnneagramType;

public interface EnneagramTypeService {

    EnneagramType findByID(int id);

    EnneagramType findByIndex(int index);
}
