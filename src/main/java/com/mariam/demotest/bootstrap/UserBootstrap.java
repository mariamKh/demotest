package com.mariam.demotest.bootstrap;

import com.mariam.demotest.models.EnneagramType;
import com.mariam.demotest.models.User;
import com.mariam.demotest.repositories.EnneagramTypeRepository;
import com.mariam.demotest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class UserBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private UserRepository userRepository;
    private EnneagramTypeRepository enneagramTypeRepository;

    @Autowired
    public UserBootstrap(UserRepository userRepository, EnneagramTypeRepository enneagramTypeRepository) {
        this.userRepository = userRepository;
        this.enneagramTypeRepository = enneagramTypeRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        userRepository.save(createUser("Armenchik", "Administrator", 1));
        userRepository.save(createUser("Vazgenchik", "Manager", 2));
        userRepository.save(createUser("Petrosik", "Developer", 3));
        userRepository.save(createUser("Poghosik", "UX designer", 4));
        userRepository.save(createUser("Vardushik", "Student", 5));
        userRepository.save(createUser("Gugushik", "Driver", 6));
        userRepository.save(createUser("Valodik", "Xadavik", 7));
        userRepository.save(createUser("Anushik", "Baker", 8));
        userRepository.save(createUser("Lidushik", "Sandship Player", 9));
    }

    private User createUser(String name, String position, int enneagramTypeIndex) {
        User user = new User();
        user.setName(name);
        user.setPosition(position);
        EnneagramType type = enneagramTypeRepository.findByIndex(enneagramTypeIndex);
        user.setEnneagramType(type);
        return user;
    }

}
