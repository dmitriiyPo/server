//package com.example.server3.service.impl;
//
//public class leks {
//}

/*

public class LoginService impl ILoginService
    private IUserRepository userRep;
    private IPasswordEncode passEncode;






public class BCryptPasswordEncoder implements IPassworsEncode {

    @override
    public String encode(String new Password){
    RETURN BCrypt.hashpw(new password, bcrypt.getSuff}
    }
}





public class LoginResponse{
    private String token;


    if(!passwordEncode.matches
        form.getPassword(),
        users.getPassword())){
        throw new loginFailedException("Wrong...);
        }
        return new LoginResponce(token,createToken(user));
        }catch (Exception e){
        throw new loginFaildeException(,,)




public interface ITokenSource {
    String createToken(UserCredentials user);
    IAuthTokenModel parseToken(String token);
   }


public JWTTokenService implements ITokenService {

    @Override
    public String createToken(UserCredentials users) {
        Instant new Instant.now();

        Clains clains = Jwts.clains()
            .setIssues("company.com")
            .setIssuedAt(Date.from(now))
            .SETExprcati(Date.friom

        clains.put("tokens", user.getRoles());
        return Jwts.builder()
            .setClains(clains)
            .signWith(
            SignatureAlgrith.HSSIZ,
            settings.getSecret()
            .conpath

    }

    @Configuration
    public class JwtConfig {
       @Value("${jwt.issuer}")
       private String issuer;
       @Value("${jwt.tokenTtlMinutes}"
       private int tokenTtlMinutes;
       @Value("${jwt.secret}")
       private String secret;
       @Bean
       public jwtSetting(){ return new JwtSetting(issucs, tokenTtlMinutes, secret);}
       }



    клиент будет хранить токен и передавать его в последствии запросах в заголовке
    Authorization:
        Bearew<token>

        один из способов - использовать
        Hendler Method Intercaptor

        Запрос при обработки проходит через цепочку обработчиков (handlers)
        Один из обработчиков - метод контроллера
        Перехватчик (interceptior) имеет метод
        preHandle который срабатывает перед вызовом обработчика Этот метод может вернуть false чтозапретит вызов обработчика

        public class AuthInterceptor implements HandlersMethodInterceptor {


            @Overide
            public boolean preHandle(HttpServiceRequest request, HttpServiceResponse response, Object handler) {

                if (handler instanceOf HandlerMethod) {
                Method method = ((HednlerMethod)handler).getMethod();

                return checkAuthorization(request, response, method);
                }
                return true;
            }
        }


        UserController:
        @GetMapping
        @RilesRequized(["admin"])

        public ResponseEntity<List<users>>
        getAll() {...}



        @Target(ElainType Method)
        @Rekeutioon(RelecutionPolic.RUNTIME)
        @Documended

        public @interface RolesRequized {




 */