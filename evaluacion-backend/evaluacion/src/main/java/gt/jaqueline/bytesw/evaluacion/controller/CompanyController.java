package gt.jaqueline.bytesw.evaluacion.controller;

import gt.jaqueline.bytesw.evaluacion.entities.Company;
import gt.jaqueline.bytesw.evaluacion.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/company")
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @PostMapping
    public ResponseEntity<Long> create(@RequestBody Company company) {
        companyRepository.save(company);
        return ResponseEntity.status(HttpStatus.CREATED).body(company.getId());
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Company company) {
        Optional<Company> companyEntity = companyRepository.findById(company.getId());

        if(companyEntity.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        Company companyData = companyEntity.get();

        companyData.setName(company.getName());
        companyData.setNit(company.getNit());
        companyData.setAddress(company.getAddress());
        companyData.setFundationDate(company.getFundationDate());

        companyRepository.save(companyData);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        Optional<Company> companyEntity = companyRepository.findById(id);

        if(companyEntity.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        companyRepository.delete(companyEntity.get());

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping
    public ResponseEntity<List<Company>> getAll() {
        List<Company> result = companyRepository.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}
