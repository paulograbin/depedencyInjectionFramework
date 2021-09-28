package application;

import framework.ApplicationContext;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UltimateStep {

    private static final Logger logger = LoggerFactory.getLogger(UltimateStep.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        final ApplicationContext applicationContext = new ApplicationContext(UltimateStep.class.getPackage());
        final CompanyService companyServiceProxy = applicationContext.getBean(CompanyService.class);

        logger.info("======== Transactional ========");
        companyServiceProxy.createCompany(new Company());
        logger.info("===============================");
    }
}
