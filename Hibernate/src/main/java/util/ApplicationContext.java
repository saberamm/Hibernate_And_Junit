package util;


import jakarta.persistence.EntityManager;
import repository.PersonRepository;
import repository.impl.PersonRepositoryImpl;
import service.PersonService;
import service.impl.PersonServiceImpl;
import dto.DtoMapper;
import dto.DtoMapperImpl;

public class ApplicationContext {


    private static final PersonService personService;


    private ApplicationContext() {

    }

    static {
        EntityManager entityManager = HibernateUtils.getEntityManagerFactory().createEntityManager();
        DtoMapper dtoMapper = new DtoMapperImpl();
        PersonRepository personRepository = new PersonRepositoryImpl(entityManager);
        personService = new PersonServiceImpl(personRepository, dtoMapper);


    }

    public static PersonService getPersonService() {
        return personService;
    }

}
