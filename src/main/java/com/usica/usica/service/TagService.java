package com.usica.usica.service;

import com.usica.usica.config.TagPrefix;
import com.usica.usica.model.Tag;
import com.usica.usica.repository.TagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TagService {

    @Autowired
    private TagRepo tagRepo;

    @Autowired
    private TagPrefix tagPrefix;

    public String createTag(String type){
        Optional<Tag> tag = tagRepo.findByType(type);

        if(tag.isEmpty()){
            Tag newTag = new Tag();
            newTag.setType(type);
            String prefix =  tagPrefix.getPrefix(type);
            newTag.setPrefix(prefix);
            newTag.setSuffix("001");
            tagRepo.save(newTag);
            return newTag.getPrefix() + newTag.getSuffix();
        }

        int updatedSuffixNumber =  Integer.parseInt(tag.get().getSuffix()) + 1;
        String updatedSuffixString = String.format("%03d", updatedSuffixNumber);

        tag.get().setSuffix(updatedSuffixString);
        tagRepo.save(tag.get());
        return tag.get().getPrefix() + tag.get().getSuffix();
    }

}
