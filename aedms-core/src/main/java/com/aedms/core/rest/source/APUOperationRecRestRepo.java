package com.aedms.core.rest.source;

import com.aedms.core.entities.source.APUOperationRec;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author jaly
 */
@RepositoryRestResource(collectionResourceRel = "apuOperationRec", path = "apuOperationRec")
public interface APUOperationRecRestRepo extends PagingAndSortingRepository<APUOperationRec, Long>{
    
}