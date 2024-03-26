package antifraud.database.repositories;

import antifraud.database.entities.SuspiciousIP;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface SuspiciousIPsRepository extends CrudRepository<SuspiciousIP, Long> {
    SuspiciousIP findSuspiciousIPByIpNumber (String ipNumber);

}
