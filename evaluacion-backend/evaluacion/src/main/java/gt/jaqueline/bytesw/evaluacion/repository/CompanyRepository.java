package gt.jaqueline.bytesw.evaluacion.repository;

import gt.jaqueline.bytesw.evaluacion.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
