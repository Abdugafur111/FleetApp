package tj.dalerzoda.fleetApp.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tj.dalerzoda.fleetApp.models.*;




@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
