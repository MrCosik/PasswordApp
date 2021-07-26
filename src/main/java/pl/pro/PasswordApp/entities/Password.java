package pl.pro.PasswordApp.entities;


import javax.persistence.*;

@Table
@Entity
public class Password {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "password")
    private String password;
    @Column(name = "site_name")
    private String siteName;
    @Column(name = "site_url")
    private String siteUrl;
    @Column(name = "user_id")
    private Long userId;

    public Password() {
    }

    public Password(String password, String siteName, String siteUrl, Long userId) {
        this.password = password;
        this.siteName = siteName;
        this.siteUrl = siteUrl;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
