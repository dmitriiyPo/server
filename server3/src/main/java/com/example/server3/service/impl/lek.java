package com.example.server3.service.impl;

public class lek {

    //структура JWT
    //токен - строка но
    //jwt это строка из трех разделов
    //-заголовок (header)
    //-полезная нагрузка (payload)
    //-подпись(signatuce)

    //скрин на рабочем столе про заголовок

    //*
    //payload может содержать след эл-ты
    //iss (issues) - издатель токена
    //iat (issuedat) - время создания
    //exp (expiration) - время жизни
    //sub (subject) -данные по существу
    //+ можно добавляеть свои поля (сleains)

    //JwtBuilder
    //setHeader(header)
    //setClains(clains)
    //setHeaderParsil(name, value)
    //set *


    //SwtParserBuilder
    //setSigningKey(algorithen, secret)
    //requiredIssuer(issuer) - проверять наличие нужного issuer
    // build() - построить JwtParser

    //JwtParder
    //parse() - распарсить все
    //parseJwtClains - извелчет payload // вернет объект класса Clains c гетерами
    //getIsseur, getIs..

    //модель пользователя:
    // пароль из бд брать только при аутентификации
    /*

    @Data
public class User {

@JsonIgnore - на пороль
@JsonCreated - на конструктор

    private long id;
    private String email;
    private List<String> roles;
    //@Data

}

public class UserCredentials{
    private long id;
    private String email;
    private List<String> roles;

    @jsonIgnore
    private String password;

    //констуркторы и тд


}

    //Как хранить пароль в БД?
    //хранить пароль в виде plaintext крайне не безопасно поэтому
    //пароли хранять в хэши паролей но это тоже не безопасно так как уезвима для атак "радужная таблица"
    // то есть этог готвоые наборы хэш-кодов
    // поэтому в хэщ-кодоы паролей добалвяется "соль" - случайный набор символов

    //работать с хэш-паролями умеет библиотека BCrypt а можно использвоать внутри Sprin-говое хозяйство
    //в Spring есть интерфейс PasswordEncoder;
    //String encode(new Password)
    //boolean matches(new Password, hashed Password)
    //Есть реализации BCryptPasswordEncoder На базе Bcrypt

public class UserRepository implements IUserRepository{
    private JdbcTemplate jdbc;
    //констукторы
    public UserCredentinals(long id){
    String sqlUser = "SELECT id, email, password id=?";
    String sqlRoles = "SELECT role FROM user_roles WHERE userId=?";
    try{
        UserCredentinals userCreds = jdbc,queryForObject(
            sql,
            (25, getString("id"),
            (25, getSring("email"),
            null,
            25.getString("password"
            id
            );
    }
    }
    List<String> roles = jdbc.query(sqlRoles, (25,newInex) ->
        25.getString("role"),
        id
        );
        return new UserCredentinals(userCreds.getId(), userCreds.getEmail(), roles);
        userCredent.getPassword
}

В БД таблицы:
табл users (id, email, password)
табл users_roles (userId, rolse)


@RestController
@RequestMapping("/users")
public class UserController {
    private IUserService userService;
    //констрктуоры

    @GetMapping
    @RolesRequired(["admin"])
    public ResponseEntity<List <User>> getAll() { }

    @GetMapping("/{id}")
    @RolesRequired("admin")
    public User getUserById(@PathVariable ("id")




     */


}
