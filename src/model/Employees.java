/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Thain
 */
public class Employees {

    Integer id;
    String name;
    String cpf;
    String password;
    String email;
    String celular;
    String tipoAcesso;

    public Employees() {
    }

    public Employees(String name, String cpf, String email, String celular, String tipoAcesso) {
        super();
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.cpf = celular;
        this.tipoAcesso = tipoAcesso;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCelular() {
        return celular;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setTipoAcesso(String acesso) {
        this.tipoAcesso = acesso;
    }

    public String getTipoAcesso() {
        return tipoAcesso;
    }

}
