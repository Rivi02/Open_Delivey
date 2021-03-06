package it.opendelivey.demo.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegistrationForm {
    @NotNull(message = "questo campo è obbligatorio")
    @NotBlank(message = "questo campo è obbligatorio")
    @Size(min=2, message = "il nome deve contenere almeno 2 caratteri")
    private String nome;
    @NotNull(message = "questo campo è obbligatorio")
    @NotBlank(message = "questo campo è obbligatorio")
    @Size(min=2, message = "il cognome deve mantenere almeno 2 caratteri")
    private String cognome;
    @NotNull(message = "questo campo è obbligatorio")
    @NotBlank(message = "questo campo è obbligatorio")
    private String mail;
    @NotNull(message = "questo campo è obbligatorio")
    @NotBlank(message = "questo campo è obbligatorio")
    @Size(min=5, message = "la password deve contenere almeno 5 caratteri") 
    private String password;
    /*@NotNull(message = "questo campo è obbligatorio")
    @NotBlank(message = "questo campo è obbligatorio")*/
    private Integer eta;


    public RegistrationForm(String nome, String cognome, String mail, String password,Integer eta) {
        this.nome = nome;
        this.eta= eta;
        this.cognome = cognome;
        this.mail = mail;
        this.password = password;
    }

    @Override
    public String toString() {
        return "RegistrationForm{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta='" + eta + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta (Integer eta) {
        this.eta = eta;
    }
}
