package application;

public interface CompanyService {

    void createCompany(Company company);

    String generateToken(Company company);

    void updateCompany(Company company);
}