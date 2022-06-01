package model;

interface Authenticable {

    void setPassword(int password);

    boolean authenticate(int password);

}
