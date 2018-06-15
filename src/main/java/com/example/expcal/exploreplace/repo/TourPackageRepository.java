package com.example.expcal.exploreplace.repo;

import com.example.expcal.exploreplace.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;

public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
    TourPackage findByName(String tourPackageName);
}
