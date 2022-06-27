package com.zildalojas.springboot.web.app.model;

public class Usuario {

  private String nombre;
  private String apellidos;
  private int telefono;
  private String documento;
  private String email;
  private String password;
  private int admin;

  public Usuario() {

  }

  public Usuario(final String nombre, final String apellidos, final int telefono,
    final String documento, final String email, final String password, final int admin) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.documento = documento;
    this.email = email;
    this.password = password;
    this.admin = admin;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(final String apellidos) {
    this.apellidos = apellidos;
  }

  public int getTelefono() {
    return telefono;
  }

  public void setTelefono(final int telefono) {
    this.telefono = telefono;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(final String documento) {
    this.documento = documento;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(final String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(final String password) {
    this.password = password;
  }

  public int getAdmin() {
    return admin;
  }

  public void setAdmin(final int admin) {
    this.admin = admin;
  }

}
