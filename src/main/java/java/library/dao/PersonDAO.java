package java.library.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.library.models.Person;
import java.util.List;

@Component
public class PersonDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate){ this.jdbcTemplate = jdbcTemplate;}

    public List<Person> index(){
        return jdbcTemplate.query("select * from library_person", new BeanPropertyRowMapper<>(Person.class));
    }

    public void save(Person person) {
         jdbcTemplate.update("insert into library_person (name, date_of_birth) values (?,?)"
                , person.getName(), person.getDateOfBirth());
    }

    public void delete(int id) {
        jdbcTemplate.update("delete from library_person where id = ?" , id);
    }


}
