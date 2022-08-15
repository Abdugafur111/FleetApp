package tj.dalerzoda.fleetApp.repositories;
import tj.dalerzoda.fleetApp.models.*;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
