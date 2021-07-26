package pl.pro.PasswordApp.entities;

import org.springframework.security.web.server.util.matcher.PathPatternParserServerWebExchangeMatcher;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "app_user")
@Table
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;


    @OneToMany(fetch = FetchType.LAZY)
    Set<Password> passwords = new HashSet<>();

    public User() {
    }

    public User(String username, String password, String email, Set<Password> passwords) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.passwords = passwords;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Password> getPasswords() {
        return passwords;
    }

    public void setPasswords(Set<Password> passwords) {
        this.passwords = passwords;
    }

    public void addPassword(Password password){
        passwords.add(password);
    }
}
