package com.example.expcal.exploreplace.services;

import com.example.expcal.exploreplace.domain.TourPackage;
import com.example.expcal.exploreplace.repo.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourPackageService {
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }

    public TourPackage createTourPackage(String code, String name){
        if(!tourPackageRepository.existsById(code)){
            tourPackageRepository.save(new TourPackage(code, name));
        }
        return null;
    }

    public Iterable<TourPackage> lookup(){
        return tourPackageRepository.findAll();
    }

    public long total(){
        return tourPackageRepository.count();
    }

}
